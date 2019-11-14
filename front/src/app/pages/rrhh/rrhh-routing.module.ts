import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {RrhhComponent} from './rrhh.component';


const routes: Routes = [
  {path: '', component: RrhhComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class RrhhRoutingModule { }
