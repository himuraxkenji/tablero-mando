import {Component, Input, OnInit} from '@angular/core';
import {ChartDataSets, ChartOptions, ChartType} from 'chart.js';
import {Label} from 'ng2-charts';
import * as pluginDataLabels from 'chartjs-plugin-datalabels';

@Component({
  selector: 'app-horizontal-chart',
  templateUrl: './horizontal-chart.component.html',
  styleUrls: ['./horizontal-chart.component.css']
})
export class HorizontalChartComponent implements OnInit {

  public barChartOptions: ChartOptions = {
    responsive: true,
    // We use these empty structures as placeholders for dynamic theming.
    scales: { xAxes: [{
        ticks: {
          beginAtZero: true
        }
      }], yAxes: [{}] },
    plugins: {
      datalabels: {
        anchor: 'end',
        align: 'end',
        formatter: (value, ctx) => {
          return value.toFixed(3);
        }

      }
    }
  };
  @Input() barChartLabels: Label[] = [];
  barChartType: ChartType = 'horizontalBar';
  barChartPlugins = [pluginDataLabels];
  barChartLegend: true;


  @Input() barChartData: ChartDataSets[] = [];

  constructor() { }

  ngOnInit() {
  }
}
