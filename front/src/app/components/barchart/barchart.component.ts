import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-barchart',
  templateUrl: './barchart.component.html',
  styleUrls: ['./barchart.component.css']
})
export class BarchartComponent implements OnInit {

  @Input() title: string;
  type = 'BarChart';
  @Input() data: any[] = [];
  @Input() columnNames = [];
  @Input() options = {
    hAxis: {
      title: ''
    },
    vAxis: {
      minValue: 0
    },
    isStacked: true
  };

  // width = 100;
  // height = 100;
  constructor() { }

  ngOnInit() {
  }

}
