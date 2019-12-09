var Student = /** @class */ (function () {
    function Student(name, age, marks, degree) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.degree = degree;
    }
    Student.prototype.printDetails = function () {
        console.log("Name is " + this.name + " age is " + this.age + " and marks are " + this.marks);
    };
    return Student;
}());
var Student1 = new Student('Avinash', 21, 75);
console.log(Student1);
//Student1.printDetails();
var Student2 = {
    name: 'Apu',
    age: 16,
    marks: 85
};
console.log(Student2);
var students = [
    new Student('name', age, marks),
    {
        name: 'Bala',
        age: 65,
        marks: 95
    },
    Student2,
    Student1
];
for (var _i = 0, Student1_1 = Student1; _i < Student1_1.length; _i++) {
    var Student_1 = Student1_1[_i];
    console.log(Student_1);
}
