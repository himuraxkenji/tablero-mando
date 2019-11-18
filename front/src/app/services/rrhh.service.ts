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

  getTotalSalarioMinimo() {
    return this.http.get<number>('http://localhost:8081/rrhh/min-salary');
  }

  getTotalSalarioMaximo() {
    return this.http.get<number>('http://localhost:8081/rrhh/max-salary');
  }

  getTotalSalarios() {
    return this.http.get<number>('http://localhost:8081/rrhh/total-salary');
  }

  getPromedioSalario() {
    return this.http.get<number>('http://localhost:8081/rrhh/promedio-salary');
  }

  getTotalAsistencia() {
    return this.http.get<number>('http://localhost:8081/rrhh/total-asistencia');
  }

  getTotalInasistencia() {
    return this.http.get<number>('http://localhost:8081/rrhh/total-inasistencia');
  }

  getTotalInasistenciaMujeres() {
    return this.http.get<number>('http://localhost:8081/rrhh/inasistencia-mujeres');
  }

  getTotalInasistenciaHombres() {
    return this.http.get<number>('http://localhost:8081/rrhh/inasistencia-hombres');
  }

  getCapacitacionHombres() {
    return this.http.get<number>('http://localhost:8081/rrhh/capacitacion-hombres');
  }

  getCapacitacionMujeres() {
    return this.http.get<number>('http://localhost:8081/rrhh/capacitacion-mujeres');
  }

  getHorasExtraMujeres() {
    return this.http.get<number>('http://localhost:8081/rrhh/extras-mujeres');
  }

  getHorasExtraHombres() {
    return this.http.get<number>('http://localhost:8081/rrhh/extras-hombres');
  }

  getDespidosHombres() {
    return this.http.get<number>('http://localhost:8081/rrhh/despidos-hombres');
  }

  getDespidosMujeres() {
    return this.http.get<number>('http://localhost:8081/rrhh/despidos-mujeres');
  }
}
