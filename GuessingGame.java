// Import the readline module for user input.
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// This is the work done in the detailLoop() method
// Generate a random number.
let number = Math.floor(Math.random() * 10) + 1;

// Prime the loop.
console.log("Do you want to guess a number? Enter Y or N");

rl.on('line', (input) => {
    let keepGoing = input;

    // Validate input.
    while(keepGoing !== "Y" && keepGoing !== "N") {
        console.log("Please enter correct value. Enter Y or N");
        keepGoing = rl.prompt();
    }

    // Enter loop if they want to play.
    while(keepGoing === "Y") {
        // Get the user's guess.
        console.log("I'm thinking of a number. .\n Try to guess by entering a number between 1 and 10");
        let userNumber = rl.prompt();

        // Validate input.
        while(userNumber < 1 || userNumber > 10) {
            console.log("Please enter correct value. Try to guess by entering a number between 1 and 10");
            userNumber = rl.prompt();
        }

        // Test to see if the user guessed correctly.
        if(userNumber == number) {
            keepGoing = "N";
            console.log("You are a genius. That's correct!");
        } else {
            console.log("That's not correct. Do you want to guess again? Enter Y or N");
            keepGoing = rl.prompt();

            // Validate input.
            while(keepGoing !== "Y" && keepGoing !== "N") {
                console.log("Please enter correct value. Enter Y or N");
                keepGoing = rl.prompt();
            }
        }
    } // End of while loop.

    rl.close();
});

	
