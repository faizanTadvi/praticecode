// const personNamename = "faizan";
// const city = "karachi";
// let age = 20;
// console.log(personNamename);
// console.log(city);  
// console.log(age);
// let x =5;
// var y = 10;
// console.log(x); // This will throw an error because 'x' is already declared with '
// console.log(count);
// var count = 10; // This will not throw an error because 'count' is declared with 'var'
// // console.log(count); // This will log 'undefined' because 'count' is hoisted
// const names = {
//     name : "faizan",
//     age : 20,
//     city :"karachi"
// };
// names.country = "india";
// console.log(names);
// console.log(a);
// let a = 10;
// const arr = [1, 2, 3];
// arr.push(4); // This works fine
// console.log(arr); // Output: [1, 2, 3, 4]
// arr = [1, 2, 3, 4]; // This works fine
// console.log(arr); // Output: [1, 2, 3, 4]
// arr = [1, 2, 3, 4, 5]; // This will throw an error because 'arr' is declared with 'const'
//  console.log(arr); // This will not execute because the previous line throws an error

// let marks = 50;
// console.log("enter your marks");
// function checkmarks(marks){
//     if(marks >= 90) console.log("A+");
//     else if(marks >=70) console.log("B+");
//     else if(marks >=60) console.log("C+");
//     else if(marks >=40) console.log("D+");
//     else if(marks >=30) console.log("E+");
//     else console.log("F"); 
// }
// checkmarks(Number(marks));

// let player1 = prompt("enter rock paper or scissors");
// console.log("player1: " + player1);
// let player2 = prompt("enter rock paper or scissors");
// console.log("player2: " + player2);

// function playgame(player1,player2) {
//     if (player1 === player2) console.log("its a tie");
//     else if(player1 === "rock" && player2 === "scissor") console.log("player1 wins");
//     else if(player1 === "scissor" && player2 === "paper") console.log("player1 wins");
//     else if(player1 === "paper" && player2 === "rock") console.log("player1 wins");
//     else console.log("player2 wins");
// }
// playgame(player1,player2);
let user = false;
let admin = false;
function loginmessage(user){
    user ? console.log("user login successfull"):console.log("Admin login");
}
loginmessage(user);


