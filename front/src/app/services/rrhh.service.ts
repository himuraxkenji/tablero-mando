import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RrhhService {

  constructor(private http: HttpClient) { }

  getTotalEmpleados() {
    return this.http.get<number>('http://localhost:8081/rrhh/total');
  }

  getTotalEmpleadosMujer() {
    return this.http.get<number>('http://localhost:8081/rrhh/total-mujeres');
  }

  getTotalEmpleadosHombre() {
    return this.http.get<number>('http://localhost:8081/rrhh/total-hombres');
  }
}
