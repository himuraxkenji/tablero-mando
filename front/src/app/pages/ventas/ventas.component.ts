import { Component, OnInit } from '@angular/core';
import {VentasService} from '../../services/ventas.service';
import {Label} from 'ng2-charts';
import {ChartDataSets} from 'chart.js';

@Component({
  selector: 'app-ventas',
  templateUrl: './ventas.component.html',
  styleUrls: ['./ventas.component.css']
})
export class VentasComponent implements OnInit {

  promiseMeses: Promise<boolean>;
  promiseImportes: Promise<boolean>;
  importesPorMes: ChartDataSets[] = [];
  importeTrimestre: ChartDataSets[] = [];
  porcentajeContadoMes: number[];
  porcentajeCreditoMes: number[];
  porcentajeTotal: ChartDataSets[] = [];
  contadoTrimestre: ChartDataSets[] = [];

  meses: Label[] = [];
  trimestre: Label[] = [];

  porcentajeCred: Label[] = ['Contado', 'Credito'];
  ubicaciones: string[];
  ventasUbicaciones: number[] = [];
  colores: string[] = [];
  medios: string[] = [];
  ventasMedio: number[] = [];

  constructor(private ventasService: VentasService) { }

  ngOnInit() {
    this.ventasService.getMeses().subscribe(data => {
      this.meses = data;
      this.promiseMeses = Promise.resolve(true);
    });

    this.ventasService.getVentasPorMes().subscribe(resp => {
      this.importesPorMes = [{ data: resp, label: 'Ventas Por Mes', backgroundColor: this.getRandomColor()}];
      this.importeTrimestre = [{ data: this.getTrimestre(resp), label: 'Importe Trimestres', backgroundColor: this.getRandomColor()}];
      this.promiseImportes = Promise.resolve(true);
    });

    this.ventasService.getContadoPorTotal().subscribe(resp => {
      this.porcentajeContadoMes = resp;
    });

    this.ventasService.getCreditoPorTotal().subscribe(resp => {
      this.porcentajeCreditoMes = resp;
      this.porcentajeCreditoMes.forEach((item, index) => {
        this.porcentajeTotal.push({data: [this.porcentajeCreditoMes[index], this.porcentajeContadoMes[index]]});
      });
    });

    this.ventasService.getVentasUbicacionesNoZero().subscribe(resp => {
      this.ubicaciones = resp;
      Promise.resolve(true);
      console.log(resp);
    });

    this.ventasService.getVentasUbicaciones().subscribe(resp => {
      resp.forEach((item) => {
        this.colores.push(this.getRandomColor());
      });

      // this.ventasUbicaciones = [{data: resp, label: 'Ubicaciones', backgroundColor: this.colores}];
      this.ventasUbicaciones = resp;
      Promise.resolve(true);
      console.log(resp);
    });

    this.ventasService.getMedios().subscribe(resp => {
      this.medios = resp;
      Promise.resolve(true);

    });
    this.ventasService.getVentasMedios().subscribe(resp => {
      this.ventasMedio = resp;
      // this.ventasUbicaciones = [{data: resp, label: 'Ubicaciones', backgroundColor: this.colores}];
      Promise.resolve(true);

      console.log(resp);
    });


  }

  getRandomColor() {
    const letters = '0123456789ABCDEF';
    let color = '#';
    for (let i = 0; i < 6; i++) {
      color += letters[Math.floor(Math.random() * 16)];
    }
    return color;
  }

  getTrimestre(resp: number[]) {
    let lista: number[] = [];
    for (let i = 0; (i + 2) < resp.length; i = i + 3) {
      const suma = resp[i] + resp[i + 1] + resp[i + 2];
      lista.push(suma);
      this.trimestre.push((i + 1) + '');
    }
    return lista;

  }
}
