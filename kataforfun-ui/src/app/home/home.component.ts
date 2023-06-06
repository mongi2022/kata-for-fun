import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html'
})
export class HomeComponent implements OnInit {
  currentInstruction = 'front';
  

  ngOnInit(): void {

    
  }

  constructor() { }


     
}
