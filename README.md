🚦 Types of Control Statements

Java has three main categories:

Conditional Statements

Looping (Iterative) Statements

Jump Statements

✅ 1. Conditional Statements
if Statement

Executes a block only if the condition is true.

if (age >= 18) {
    System.out.println("Eligible to vote");
}

if-else Statement

Provides two possible branches.

if (marks >= 40) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}

else-if Ladder

Used for multiple conditions.

if (score >= 90) {
    System.out.println("A Grade");
} else if (score >= 75) {
    System.out.println("B Grade");
} else {
    System.out.println("C Grade");
}

switch Statement

Useful when comparing one value with many possible options.

switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Invalid day");
}

🔁 2. Looping Statements
for Loop

Runs a block of code a fixed number of times.

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

while Loop

Runs while the condition remains true.

while (n <= 5) {
    System.out.println(n);
    n++;
}

do-while Loop

Runs the block at least once.

do {
    System.out.println(num);
    num++;
} while (num <= 5);

⏩ 3. Jump Statements
break

Stops the loop or switch immediately.

for (int i = 1; i <= 10; i++) {
    if (i == 5) break;
}

continue

Skips the current iteration and moves to the next.

for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}

return

Ends a method and optionally returns a value.

return result;

📘 Summary

Control statements decide what runs and when.

Use if / else / switch for decisions.

Use for / while / do-while for repeating tasks.

Use break / continue / return to manage loop flow and method exit.
