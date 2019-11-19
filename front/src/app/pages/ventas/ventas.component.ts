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
  meses: Label[] = [];
  trimestre: Label[] = [];


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
