import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  @Input() titulo: string;
  @Input() contenido: number ;
  @Input() clases: string ;

  constructor() { }

  ngOnInit() {
  }

}
