var myName = 'Avinash';
// myName = 123; error we cannot change the datatypes
var company; //implicitly it will considered as an any
company = 1233;
company = 'ty';
company = true;
var age;
age = 21;
age = 'twentyone';
// age = true; error we can store only string and number
//tuple
var details = ['xyz', 12, 15];
var mobiles = ['iphone', 'samsung', 'true'];
function add(a, b) {
    return a + b;
}
console.log(add(2, 3));
