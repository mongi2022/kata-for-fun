import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { ItemWithPath } from '../model/nav-item';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html'
})
export class NavBarComponent implements OnInit {
  @Input() item1:string='front';
  navItems: ItemWithPath[] = [{text: 'Accueil', path: 'home'},
       {text: 'Kata For Fun', path: 'home'}];

  constructor() { }

  ngOnInit(): void {
  }

  addmessage(value: string) {
    this.item1 =value
    console.log(value);
    
  }
}
