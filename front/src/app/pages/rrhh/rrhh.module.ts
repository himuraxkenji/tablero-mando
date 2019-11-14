import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RrhhComponent} from './rrhh.component';
import {ComponentsModule} from '../../components/components.module';
import {RrhhRoutingModule} from './rrhh-routing.module';


@NgModule({
  declarations: [
    RrhhComponent
  ],
  imports: [
    CommonModule,
    RrhhRoutingModule,
    ComponentsModule
  ]
})
export class RrhhModule { }
