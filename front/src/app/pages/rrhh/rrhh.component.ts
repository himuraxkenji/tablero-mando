import { Component, OnInit } from '@angular/core';
import {RrhhService} from '../../services/rrhh.service';
import {Label} from 'ng2-charts';

@Component({
  selector: 'app-rrhh',
  templateUrl: './rrhh.component.html',
  styleUrls: ['./rrhh.component.css']
})
export class RrhhComponent implements OnInit {

  totalEmpleados: number;
  totalHombresMujeres: number[] = [];
  labelHombresYMujeres: Label = ['Hombres', 'Mujeres'];

  totalSueldos: number;
  minimoSueldos: number;
  maximoSueldos: number;
  sueldoPromedio: number;

  totalAsistencia: number[] = [];
  labelAsistencia: Label = ['Inasistencia', 'Asistencia'];

  totalInasistenciaGenero: any[] = [];
  labelInasistenciaGenero = ['Inasistencia', 'Hombre', 'Mujer'];
  promiseInasistenciaHombres: Promise<boolean>;
  promiseInasistenciaMujeres: Promise<boolean>;

  optionsInasistencia = {
    hAxis: {
      title: 'Inasistencia'
    },
    vAxis: {
      minValue: 0
    },
    isStacked: true
  };

  inasistencia: any[] = [];

  cursosMujeres: number;
  cursosHombres: number;
  totalCursos: any[] = [];
  labelCursoCapacitacion = ['Cursos', 'Hombre', 'Mujer'];
  optionsCursos = {
    hAxis: {
      title: 'Curso Capacitacion'
    },
    vAxis: {
      minValue: 0
    },
    isStacked: true
  };

  extrasMujeres: number;
  extrasHombres: number;
  totalHorasExtra: any[] = [];
  labelHorasExtra = ['Horas', 'Hombre', 'Mujer'];
  optionsExtras = {
    hAxis: {
      title: 'Horas Extra'
    },
    vAxis: {
      minValue: 0
    },
    isStacked: true
  };

  despidosMujeres: number;
  despidosHombres: number;
  totalDespidos: any[] = [];
  labelDespidos = ['Despidos', 'Hombre', 'Mujer'];
  optionsDespidos = {
    hAxis: {
      title: 'Despidos'
    },
    vAxis: {
      minValue: 0
    },
    isStacked: true
  };
  promiseCursosHombres: Promise<boolean>;
  promiseCursosMujeres: Promise<boolean>;
  promiseExtrasHombres: Promise<boolean>;
  promiseExtrasMujeres: Promise<boolean>;
  promiseDespidosHombres: Promise<boolean>;
  promiseDespidosMujeres: Promise<boolean>;
  constructor(private rrhhService: RrhhService) {

  }

  ngOnInit(): void {


    this.rrhhService.getTotalEmpleados().subscribe(data => {
      this.totalEmpleados = data;
      console.log(data);
    });

    this.rrhhService.getTotalEmpleadosHombre().subscribe(data => {
      this.totalHombresMujeres.push(data);
      console.log(data);
    });

    this.rrhhService.getTotalEmpleadosMujer().subscribe(data => {
      this.totalHombresMujeres.push(data);
    });

    this.rrhhService.getTotalSalarios().subscribe(data => {
      this.totalSueldos = data;
    });

    this.rrhhService.getPromedioSalario().subscribe(data => {
      this.sueldoPromedio = data;
    });
    this.rrhhService.getTotalSalarioMaximo().subscribe(data => {
      this.maximoSueldos = data;
    });

    this.rrhhService.getTotalSalarioMinimo().subscribe(data => {
      this.minimoSueldos = data;
    });

    this.rrhhService.getTotalInasistencia().subscribe(data => {
      this.totalAsistencia.push(data);
    });

    this.rrhhService.getTotalAsistencia().subscribe(data => {
      this.totalAsistencia.push(data);
    });

    this.rrhhService.getTotalInasistenciaMujeres().subscribe(data => {
      this.totalInasistenciaGenero.push(data);
      this.promiseInasistenciaMujeres = Promise.resolve(true);

    });
    this.rrhhService.getTotalInasistenciaHombres().subscribe(data => {
      this.totalInasistenciaGenero.push(data);
      this.inasistencia = [['Inasistencia', this.totalInasistenciaGenero[0], this.totalInasistenciaGenero[1]]];
      this.promiseInasistenciaHombres = Promise.resolve(true);

    });

    this.rrhhService.getCapacitacionMujeres().subscribe(data => {
      this.cursosMujeres = data;
      this.promiseCursosMujeres = Promise.resolve(true);
    });

    this.rrhhService.getCapacitacionHombres().subscribe(data => {
      this.cursosHombres = data;
      this.totalCursos = [ ['Curso Capacitacion', this.cursosHombres, this.cursosMujeres]];
      this.promiseCursosHombres = Promise.resolve(true);
    });

    this.rrhhService.getHorasExtraHombres().subscribe(data => {
      this.extrasHombres = data;
      this.promiseExtrasHombres = Promise.resolve(true);
    });

    this.rrhhService.getHorasExtraMujeres().subscribe(data => {
      this.extrasMujeres = data;
      this.totalHorasExtra = [ ['Horas Extra', this.extrasHombres, this.extrasMujeres]];
      this.promiseExtrasMujeres = Promise.resolve(true);

    });

    this.rrhhService.getDespidosHombres().subscribe(data => {
      this.despidosHombres = data;
      this.promiseDespidosHombres = Promise.resolve(true);
    });

    this.rrhhService.getDespidosMujeres().subscribe(data => {
      this.despidosMujeres = data;
      this.totalDespidos = [ ['Despidos', this.despidosHombres, this.despidosMujeres]];
      this.promiseDespidosMujeres = Promise.resolve(true);

    });

  }



}
