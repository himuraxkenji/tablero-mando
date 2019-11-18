import { Component, OnInit } from '@angular/core';
import {VariosService} from '../../services/varios.service';
import {ChartDataSets} from 'chart.js';
import {resolve} from 'url';
import {colors} from '@angular/cli/utilities/color';

@Component({
  selector: 'app-varios',
  templateUrl: './varios.component.html',
  styleUrls: ['./varios.component.css']
})
export class VariosComponent implements OnInit {

  anios: number[] = [];
  liquidezTotal: ChartDataSets[] = [];
  liquidesAcida: ChartDataSets[] = [];
  // liquidesCorriente: any[] = [];
  solvencia: ChartDataSets[] = [];
  endeudamiento: ChartDataSets[] = [];
  esfuerzo: ChartDataSets[] = [];
  liquidezCorriente: ChartDataSets[];

  promiseAnios: Promise<boolean>;
  promiseLiquidesAcida: Promise<boolean>;
  promiseLiquidesCorriente: Promise<boolean>;
  promiseSolvencia: Promise<boolean>;
  promiseEndeudamiento: Promise<boolean>;
  promiseEsfuerzo: Promise<boolean>;



  constructor(private sdv: VariosService) { }

  async ngOnInit() {
    this.sdv.getAnios().subscribe(data => {
      this.anios = data;
      this.promiseAnios = Promise.resolve(true);
    });

    this.sdv.getliquidezAcida().subscribe(resp => {

      this.liquidesAcida = [{ data: resp, label: 'Liquidez Acida', backgroundColor: this.getRandomColor()}];
      this.liquidezTotal.push(this.liquidesAcida[0]);
      this.promiseLiquidesAcida = Promise.resolve(true);

    });

    this.sdv.getliquidezCorriente().subscribe(resp => {
      this.liquidezCorriente = [{data: resp, label: 'Liquidez Corriente', backgroundColor: this.getRandomColor()}];
      this.liquidezTotal.push(this.liquidezCorriente[0]);
      this.promiseLiquidesCorriente = Promise.resolve(true);
    });

    this.sdv.getsolvencia().subscribe(resp => {
      this.solvencia = [{ data: resp, label: 'Solvencia', backgroundColor: '#ff6384' }];
      this.promiseSolvencia = Promise.resolve(true);
    });

    this.sdv.getendeudamiento().subscribe(resp => {
      this.endeudamiento = [{ data: resp, label: 'Endeudamiento', backgroundColor: this.getRandomColor()}];
      this.promiseEndeudamiento = Promise.resolve(true);
    });

    this.sdv.getesfuerzoComercializacion().subscribe(resp => {
      this.esfuerzo = [{ data: resp, label: 'Esfuerzo de Comercializacion', backgroundColor: this.getRandomColor()}];
      this.promiseEsfuerzo = Promise.resolve(true);
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


}
