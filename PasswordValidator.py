let attempt = 0;
let success = false;

while (true) {
    let passcode = prompt("PIN: ");
    attempt += 1;

    if (passcode === "4321") {
        success = true;
        break;
    } else if (attempt >= 3) {
        console.log("Too many incorrect attempts!");
        break;
    }

    console.log("Wrong");
}

if (success === true) {
    console.log(`Correct! It took you ${attempt} attempts`);
}
