import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RrhhComponent} from './rrhh.component';
import {ComponentsModule} from '../../components/components.module';
import {RrhhRoutingModule} from './rrhh-routing.module';
import {GoogleChartsModule} from 'angular-google-charts';


@NgModule({
  declarations: [
    RrhhComponent
  ],
  imports: [
    CommonModule,
    RrhhRoutingModule,
    ComponentsModule,
    GoogleChartsModule
  ]
})
export class RrhhModule { }
