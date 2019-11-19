import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProduccionService {

  constructor(private http: HttpClient) { }

  getProductos() {
    return this.http.get<string[]>('http://localhost:8081/produccion/productos');
  }

  getTerminados() {
    return this.http.get<number[]>('http://localhost:8081/produccion/terminados');
  }

  getEnProceso() {
    return this.http.get<number[]>('http://localhost:8081/produccion/en-proceso');
  }

  getDefectuosos() {
    return this.http.get<number[]>('http://localhost:8081/produccion/defectuosos');
  }
}
