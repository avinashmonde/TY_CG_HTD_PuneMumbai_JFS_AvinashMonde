let myName : string ='Avinash';
// myName = 123; error we cannot change the datatypes
let company;//implicitly it will considered as an any
company = 1233;
company = 'ty';
company = true;

let age: string | number;
age =21;
age ='twentyone';
// age = true; error we can store only string and number

//tuple
let details :[string, number, number] =['xyz',12,15];

let mobiles :string[] =['iphone','samsung','true'];

function add(a:number, b:number) : number{
    return a+b;
}
console.log(add(2,3));