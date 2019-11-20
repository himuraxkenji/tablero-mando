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

  getContadoPorTotal() {
    return this.http.get<number[]>('http://localhost:8081/ventas/contado-mes');
  }

  getCreditoPorTotal() {
    return this.http.get<number[]>('http://localhost:8081/ventas/credito-mes');
  }
  getUbicaciones() {
    return this.http.get<string[]>('http://localhost:8081/ventas/ubicaciones');
  }

  getVentasUbicaciones() {
    return this.http.get<number[]>('http://localhost:8081/ventas/ventas-ubicaciones');
  }

  getVentasUbicacionesNoZero() {
    return this.http.get<string[]>('http://localhost:8081/ventas/ventas-ubicaciones-no-zero');
  }

  getMedios() {
    return this.http.get<string[]>('http://localhost:8081/ventas/medios');
  }
  getVentasMedios() {
    return this.http.get<number[]>('http://localhost:8081/ventas/ventas-medio');
  }
}
