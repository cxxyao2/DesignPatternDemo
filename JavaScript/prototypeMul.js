function Parent (name,age ){
  this.name = name;
  this.age = age;
  this.printParent2 = function () {
    return name + ' is old as ' + age;
  }
}

function Student (class1) {
  this.class1 = class1;
  this.printParent = function () {
    return class1;
  }
}


Student.prototype = new Parent('Sally', 12);
 //Student.prototype.constructor = Student;


 var test1 = new Student("sec2");
console.log('test1 parent', test1.printParent());
console.log('test1 parent2', test1.printParent2());
console.log("test1 name is " ,test1.name);
console.log("Student name is " , Student.prototype.constructor === Parent);  // true

for(let aaa of Object.getOwnPropertyNames(test1)) {
  console.log("key is " + aaa);
}
