import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {PieComponent} from './pie/pie.component';
import {ChartsModule} from 'ng2-charts';
import { CardComponent } from './card/card.component';
import { BarchartComponent } from './barchart/barchart.component';
import {GoogleChartsModule} from 'angular-google-charts';
import { BarrasComponent } from './barras/barras.component';
import { HorizontalChartComponent } from './horizontal-chart/horizontal-chart.component';
import { DonutComponent } from './donut/donut.component';



@NgModule({
  declarations: [PieComponent, CardComponent, BarchartComponent, BarrasComponent, HorizontalChartComponent, DonutComponent],
  imports: [
    CommonModule, ChartsModule, GoogleChartsModule

  ],
  exports: [PieComponent, CardComponent, BarchartComponent, BarrasComponent, HorizontalChartComponent, DonutComponent]

})
export class ComponentsModule { }
