import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {VariosComponent} from './varios.component';
import {VariosRoutingModule} from './varios-routing.module';
import {ComponentsModule} from '../../components/components.module';


@NgModule({
  declarations: [ VariosComponent],
  imports: [
    CommonModule,
    VariosRoutingModule,
    ComponentsModule
  ]
})
export class VariosModule { }
