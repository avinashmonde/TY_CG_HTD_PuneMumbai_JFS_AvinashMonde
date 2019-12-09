import { Component, OnInit } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  product :Product[]=[
    {
      name:'Mac-Book Air',
      imgURL:'https://cdn.pixabay.com/photo/2014/05/02/21/50/home-office-336378__340.jpg',
      price:5999,
      details:'very good laptop'
  },{
    name:'Smart Phone',
    imgURL:'https://cdn.pixabay.com/photo/2015/01/29/11/36/mobile-616012__340.jpg',
    price:20000,
    details:'very good phone'
},{
  name:'Cat',
  imgURL:'https://cdn.pixabay.com/photo/2015/05/22/05/52/cat-778315__340.jpg',
  price:7999,
  details:'good cat'
},{
  name:'Dog',
  imgURL:'https://cdn.pixabay.com/photo/2016/12/13/05/15/puppy-1903313__340.jpg',
  price:6000,
  details:'good dog'
},


]
  constructor() { }

  ngOnInit() {
  }

}
