class Student {
    constructor (public name: string,
        public age: number,
        public marks: number,
        public degree?: string ){
        }

    printDetails(){
        console.log(`Name is ${this.name} age is ${this.age} and marks are ${this.marks}`);
    }
}
let Student1 =new Student('Avinash',21,75);

console.log(Student1);
//Student1.printDetails();

let Student2: Student = {
name:'Apu',
age:16,
marks:85
}
console.log(Student2);

let students: Student[] =[
    new Student('name',age,marks)
    {
        name:'Bala',
        age:65,
        marks:95
    },
    Student2,
    Student1
];

for(let Student of Student1){
    console.log(Student, 'object printed');
}

class Graducate extends Student {
   constructor(
    name: string,
     age: number,
     marks: number,
     degree?: string )
   ){
       super(name, age, marks);

   }
}