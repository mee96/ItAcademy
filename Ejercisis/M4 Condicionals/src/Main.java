//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    boolean isRaining = true;

    if (isRaining) {
        System.out.println("Bring an umbrella!");
    }


    int day = 4;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break; // break fa trencar el loop, el para, si no imprimiria tot a partir dalli
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
    }
}


/* Most often, conditions are created using comparison operators, like the ones below:

Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to: a == b
Not equal to: a != b

You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed

 */