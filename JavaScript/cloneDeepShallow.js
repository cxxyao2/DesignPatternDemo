// javascript create object
// Reference Types (e.g. arrays)  vs Primitive types(e.g. number, string )
// javascript 的{..object} Object.assign({},foodObject) 是shallow Clone,
// javascript的 JSON.parse(JSON.stringify(foodObject)) is deep copy, but cannot copy Symbols
// deepClone work with all types, function and Symbol are copied by reference.
// javascript deep copy. we can use lodash . website https://lodash.com/docs/#cloneDeep
// I'd like you to note that there are some differences between deepClone and JSON.stringify/parse.
// JSON.stringify/parse only work with Number and String and Object literal without function or Symbol properties.

function student(name, age) {
  let sy = Symbol(name);
  this.name = name;
  this.age = age;
  this[sy] = "name is " + name;
  this.getAge = function () {
    console.log("hi,print getAge");
    return age;
  };
}

const newStudent = new student("xi", 12);
newStudent.getAge();
student.prototype.getName = function () {
  console.log("get name", this.name);
};
newStudent.getName();
console.log("prototype", newStudent.__proto__ === student); // false
console.log("prototype", newStudent.__proto__.constructor === student); // true

const cloneO = Object.assign({}, newStudent);
console.log("clone0 ", cloneO);

const clone2 = { ...newStudent };
console.log("clone2 ", clone2);

// JSON.parse. JSON.stringify存在巨大问题,Symbol属性相关不能clone
const clone3 = JSON.parse(JSON.stringify(newStudent));
console.log("clone3 ", clone3);

// A shallow copy means the first level is copied, deeper levels are referenced.
// a nested object

const nestedObject = {
  flag: "canada",
  country: {
    city: "vancouver",
  },
};
// const shallowC = { ...nestedObject };
const shallowC = JSON.parse(JSON.stringify(nestedObject)); //deep clone,but Symbol is lost
//change our cloned object
shallowC.flag = "ame";
shallowC.country.city = "montreal";
console.log("nestedObject is ", nestedObject);
console.log("shallowC is ", shallowC);

function func(param1, param2, ...rest) {
  // rest operator
  console.log("All parameters: ", { param1, param2, ...rest }); // spread operator
  return param1 + param2;
}

func(1, 2, 3, 4, 5);
console.log(
  "is object? ",
  Object.getPrototypeOf(shallowC) === Object.prototype
);
console.log("is object? ", Object.getPrototypeOf(clone2) === Object.prototype);
console.log(
  "is object? ",
  Object.getPrototypeOf(newStudent) === Object.prototype,
  " ",
  Object.getPrototypeOf(newStudent)
); // false  student

// true clone,
// copy all properties
// const clone1 = Object.defineProperties({},Object.getOwnPropertyDescriptors(obj));
// + prototype
// const clone2 = Object.create(Object.getPrototypeOf(obj),Object.getOwnPropertyDescriptors(obj));
// Pitfall: cloning is always shallow, it will not be (recursively, deeply) cloned itself:

// using recursion to deepClone an array
// const clone = items => items.map(item=>Array.isArray(item) ? clone(item):item));
