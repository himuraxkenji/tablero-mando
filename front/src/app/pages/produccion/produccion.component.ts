import { Component, OnInit } from '@angular/core';
import {ProduccionService} from '../../services/produccion.service';
import {ChartDataSets, ChartLegendLabelItem} from 'chart.js';

@Component({
  selector: 'app-produccion',
  templateUrl: './produccion.component.html',
  styleUrls: ['./produccion.component.css']
})
export class ProduccionComponent implements OnInit {

  promiseProductos: Promise<boolean> ;
  promiseTerminados: Promise<boolean> ;
  promiseEnProceso: Promise<boolean> ;
  promiseDefectuoso: Promise<boolean> ;

  productos: string[] = [];
  terminados: ChartDataSets[] = [];
  enProceso: ChartDataSets[] = [];
  defectuosos: ChartDataSets[] = [];

  colorsTerminados: string[] = [];
  colorsEnProceso: string[] = [];
  colorsDefectuosos: string[] = [];

  hoverTerminados: string[] = [];

  labelPorcentaje: string[] = ['Bien', 'Normal', 'Peligro'];

  porcentajesAvance: number[] = [20, 40, 40];
  porcentajesProceso: number[] = [20, 40, 40];
  porcentajesDefectuosos: number[] = [2, 5, 93];
  constructor(private ps: ProduccionService) { }

  ngOnInit() {
    this.ps.getProductos().subscribe(resp => {
      this.productos =  resp;
      this.promiseProductos = Promise.resolve(true);
    });

    this.ps.getTerminados().subscribe(resp => {
      this.colorStatus(resp, this.colorsTerminados);
      this.terminados = [{
        data: resp,
        label: 'Avance',
        backgroundColor: this.colorsTerminados,
        hoverBackgroundColor: this.hoverTerminados}];
      this.promiseTerminados = Promise.resolve(true);
    });

    this.ps.getEnProceso().subscribe(resp => {
      this.colorEnProceso(resp, this.colorsEnProceso);
      this.enProceso = [{
        data: resp,
        label: 'En Proceso',
        backgroundColor: this.colorsEnProceso,
        hoverBackgroundColor: this.hoverTerminados}];
      this.promiseEnProceso = Promise.resolve(true);
    });

    this.ps.getDefectuosos().subscribe(resp => {
      this.colorDectuosos(resp, this.colorsDefectuosos);
      this.defectuosos = [{
        data: resp, label: 'Defectuosos',
        backgroundColor: this.colorsDefectuosos,
        hoverBackgroundColor: this.hoverTerminados}];
      this.promiseDefectuoso = Promise.resolve(true);
    });
  }


  colorStatus(resp: number[], color: string[]) {
    resp.forEach((data, index) => {
      if (data >= 80) {
        color.push('#3ebf9b');
      } else if ( data <= 79 && data >= 40) {
        color.push('#f3af37');
      } else {
        color.push('#e84351');
      }
    });
  }

  colorEnProceso(resp: number[], color: string[]) {
    resp.forEach((data, index) => {
      if (data >= 61) {
        color.push('#e84351');
      } else if ( data <= 60 && data >= 21) {
        color.push('#f3af37');
      } else {
        color.push('#3ebf9b');
      }
    });
  }

  colorDectuosos(resp: number[], color: string[]) {
    resp.forEach((data, index) => {
      if (data >= 9) {
        color.push('#e84351');
      } else if ( data <= 8 && data >= 3) {
        color.push('#f3af37');
      } else {
        color.push('#3ebf9b');
      }
    });
  }
}
