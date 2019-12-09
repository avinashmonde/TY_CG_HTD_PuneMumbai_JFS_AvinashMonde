import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
  inputData;
  flag=false;
name='Avinash';
imgURL ='https://cdn.pixabay.com/photo/2018/01/06/23/25/snow-3066167__340.jpg'
  constructor() { 
    setInterval(() => {
      this.flag = !this.flag;
    }, 1000);
  }

  eventOccured(input){
    console.log(input.value); // to get output printed everytime inside console 
    console.log('key up event occured');
  }

  ngOnInit() {
  }

}
