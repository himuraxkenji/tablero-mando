import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class VentasService {

  constructor(private http: HttpClient) { }

  getMeses() {
    return this.http.get<string[]>('http://localhost:8081/ventas/meses');
  }

  getVentasPorMes() {
    return this.http.get<number[]>('http://localhost:8081/ventas/venta-mes');
  }
}
