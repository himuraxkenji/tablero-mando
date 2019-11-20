import {Component, Input, OnInit} from '@angular/core';
import {ChartDataSets, ChartOptions, ChartType} from 'chart.js';
import {Label} from 'ng2-charts';
import * as pluginDataLabels from 'chartjs-plugin-datalabels';
import {RrhhService} from '../../services/rrhh.service';

@Component({
  selector: 'app-pie',
  templateUrl: './pie.component.html',
  styleUrls: ['./pie.component.css']
})
export class PieComponent implements OnInit {

  public pieChartOptions: ChartOptions = {
    responsive: true,
    legend: {
      position: 'top',
    },
    plugins: {
      datalabels: {
        formatter: (value, ctx) => {
          /*const label = ctx.chart.data.labels[ctx.dataIndex];
          return label;*/
          // @ts-ignore
          const suma = ctx.chart.data.datasets[0].data.reduce((a, b) => a + b, 0);
          return ctx.chart.data.labels[ctx.dataIndex] + ' : '  + Math.round(value * 100 / suma ).toFixed(2) + '%';

        // formatter: (value, ctx) => {



        },
      },
    }
  };
  @Input() public pieChartLabels: Label[] = [];
  @Input()  public pieChartData: number[] = [];
  public pieChartType: ChartType = 'pie';
  public pieChartLegend = true;
  public pieChartPlugins = [pluginDataLabels];
  public pieChartColors = [
    {
      backgroundColor: ['rgba(255,0,0,0.3)', 'rgba(0,255,0,0.3)', 'rgba(0,0,255,0.3)', 'rgba(46, 138, 138, 1)',
      '#453850', '#f048b7', '#63d8f0', '#bfa584', '#453850', '#f048b7', '#63d8f0', '#bfa584'],
    },
  ];

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
