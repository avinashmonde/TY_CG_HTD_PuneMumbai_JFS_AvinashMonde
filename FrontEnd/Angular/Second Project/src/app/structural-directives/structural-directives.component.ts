import { Component, OnInit } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent implements OnInit {

  flag=false;
  person='Diptesh';
  students: Student[] =[
    {
      id:1254,
      name: 'Avinash',
      age: 30,
      degree: 'BE'
  },{
    id:1357,
      name: 'Viraj',
      age: 20,
      degree: 'BMS'
  },{
    id:1587,
      name: 'Swapnil',
      age: 35,
      degree: 'BA'
  },{
    id:1679,
      name: 'Akshay',
      age: 35,
      degree: 'BCOM'
  },{
    id:1973,
      name: 'Raj',
      age: 34,
      degree: 'BTECH'
  }
]
  constructor() { 
    setTimeout(() => {
      this.flag=true;
    }, 2000);
  }
  deleteStudent(student: Student){
    const index = this.students.indexOf(student);
    this.students.splice(index,1);
  }

  ngOnInit() {
  }

}
