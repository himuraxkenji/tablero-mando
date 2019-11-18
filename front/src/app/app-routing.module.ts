import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  {path: 'rrhh', loadChildren: './pages/rrhh/rrhh.module#RrhhModule'},
  {path: 'ventas', loadChildren: './pages/ventas/ventas.module#VentasModule'},
  {path: 'produccion', loadChildren: './pages/produccion/produccion.module#ProduccionModule'},
  {path: 'varios', loadChildren: './pages/varios/varios.module#VariosModule'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
