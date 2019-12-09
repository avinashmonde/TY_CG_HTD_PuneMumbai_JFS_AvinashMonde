import { Component, OnInit } from '@angular/core';
import { Bike } from "../bike";

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {

 
  bikes: Bike[] =[
    {
      brand: 'Royal Enfield',
      imgURL: 'https://cdn.pixabay.com/photo/2017/11/23/04/07/royal-enfield-2972006__340.jpg',
      model: 'afa',
      price: 500000,
      specs: ``
    },{
      brand: 'TVS',
      imgURL: 'https://cdn.pixabay.com/photo/2017/12/29/05/58/sport-3046819__340.jpg',
      model: 'agfae',
      price: 600000,
      specs: ``
    },{
      brand: 'BMW',
      imgURL: 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
      model: 'asfa',
      price: 600000,
      specs: ``
    }
  ];

  selectedBike: Bike =this.bikes[0];

  constructor() { }

  selectBike(bike){
    this.selectedBike = bike;
  }

  ngOnInit() {
  }

}
