import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  {path: 'rrhh', loadChildren: './pages/rrhh/rrhh.module#RrhhModule'},
  {path: 'ventas', loadChildren: './pages/ventas/ventas.module#VentasModule'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
