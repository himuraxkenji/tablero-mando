import {Component, Input, OnInit} from '@angular/core';
import {Label, MultiDataSet} from 'ng2-charts';
import {ChartColor, ChartOptions, ChartType} from 'chart.js';

@Component({
  selector: 'app-donut',
  templateUrl: './donut.component.html',
  styleUrls: ['./donut.component.css']
})
export class DonutComponent implements OnInit {

  @Input() doughnutChartLabels: Label[] = ['Bien', 'Normal', 'Peligro'];
  @Input() doughnutChartData: MultiDataSet = [];
  // doghnutColor: ChartColor = [{ '#3ebf9b', '#f3af37', '#e84351'}];
  public doughnutColors:any[] = [
    { backgroundColor: ['#3ebf9b', '#f3af37', '#e84351'] },
    { borderColor: ['#AEEBF2', '#FEFFC9'] }];
  public doughnutChartType: ChartType = 'doughnut';

  constructor() { }

  ngOnInit() {
  }

  // events
  public chartClicked({ event, active }: { event: MouseEvent, active: {}[] }): void {
    console.log(event, active);
  }

  public chartHovered({ event, active }: { event: MouseEvent, active: {}[] }): void {
    console.log(event, active);
  }

}
