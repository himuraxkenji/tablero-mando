import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ProduccionComponent} from './produccion.component';
import {ComponentsModule} from '../../components/components.module';
import {ProduccionRoutingModule} from './produccion-routing.module';



@NgModule({
  declarations: [ ProduccionComponent],
  imports: [
    CommonModule,
    ProduccionRoutingModule,
    ComponentsModule
  ]
})
export class ProduccionModule { }
