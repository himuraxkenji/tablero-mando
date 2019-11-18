import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {VentasComponent} from './ventas.component';
import {VentasRoutingModule} from './ventas-routing.module';
import {ComponentsModule} from '../../components/components.module';

@NgModule({
  declarations: [VentasComponent],
  imports: [
    CommonModule, VentasRoutingModule, ComponentsModule]
})
export class VentasModule { }
