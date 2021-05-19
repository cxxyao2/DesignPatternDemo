const lodashClonedeep = require("lodash.clonedeep");

const arrOfFunction = [
  () => 2,
  {
    test: () => 3,
  },
  Symbol("4"),
];

// deepClone copy by refence function and Symbol
console.log(lodashClonedeep(arrOfFunction));
// JSON replace function with null and function in object with undefined
console.log(JSON.parse(JSON.stringify(arrOfFunction)));

// function and symbol are copied by reference in deepClone
console.log(
  lodashClonedeep(arrOfFunction)[0] === lodashClonedeep(arrOfFunction)[0]
);
console.log(
  lodashClonedeep(arrOfFunction)[2] === lodashClonedeep(arrOfFunction)[2]
);
