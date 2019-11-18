import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class VariosService {

  constructor(private http: HttpClient) { }

  getAnios() {
    return this.http.get<number[]>('http://localhost:8081/datos-varios/anios');
  }

  getliquidezAcida() {
    return this.http.get<number[]>('http://localhost:8081/datos-varios/liquides-acida');
  }

  getliquidezCorriente() {
    return this.http.get<number[]>('http://localhost:8081/datos-varios/liquides-corriente');
  }

  getsolvencia() {
    return this.http.get<number[]>('http://localhost:8081/datos-varios/solvencia');
  }

  getendeudamiento() {
    return this.http.get<number[]>('http://localhost:8081/datos-varios/endeudamiento');
  }

  getesfuerzoComercializacion() {
    return this.http.get<number[]>('http://localhost:8081/datos-varios/esfuerzo');
  }
}
