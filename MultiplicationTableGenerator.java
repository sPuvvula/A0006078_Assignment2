
// Use the prompt function to get input from the user
let num1 = prompt("Input a number: ");

// Convert the input to a number
num1 = Number(num1);

// Use a loop to calculate and print the multiplication table for the input number
for (let i = 0; i < 10; i++) {
    // Calculate and print the result of num1 multiplied by (i+1)
    console.log(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
}
