import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {PieComponent} from './pie/pie.component';
import {ChartsModule} from 'ng2-charts';
import { CardComponent } from './card/card.component';



@NgModule({
  declarations: [PieComponent, CardComponent],
  imports: [
    CommonModule, ChartsModule
  ],
  exports: [PieComponent, CardComponent]

})
export class ComponentsModule { }
