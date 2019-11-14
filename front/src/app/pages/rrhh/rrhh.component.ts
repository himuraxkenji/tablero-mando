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
  }

}
