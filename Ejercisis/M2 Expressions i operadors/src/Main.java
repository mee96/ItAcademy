//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//comencem M2- Expressions i operadors



    int x = 5;
    int y = 6;
    System.out.println(x + y);

    // Student data
    String studentName = "Rodney";
    int studentID = 15;
    int studentAge = 26;
    float studentFee = 75.25f;
    char studentGrade = 'S';


    System.out.println("Student name: " + studentName);
    System.out.println("Student id: " + studentID);
    System.out.println("Student age: " + studentAge);
    System.out.println("Student fee: " + studentFee);
    System.out.println("Student grade: " + studentGrade);

    //si volem que una variable no cambie podem usar 'final'
    final int num = 6;
    /*num = 7; surtira un error perqe num es 6 no podem cambiarho
    podem usaru per coses que no cambien al futur*/

//Type casting means converting one data type into another. For example, turning an int into a double.
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);
    System.out.println(myDouble);


    double myDoublee = 9.78d;
    int myIntt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);
    System.out.println(myInt);


 //OPERADORS
   /*

 +	Addition	Adds together two values	x + y
-	Subtraction	Subtracts one value from another	x - y
*	Multiplication	Multiplies two values	x * y
/	Division	Divides one value by another	x / y
%	Modulus	Returns the division remainder	x % y
++	Increment	Increases the value of a variable by 1	++x
--	Decrement	Decreases the value of a variable by 1	--x

    */


    /*
    =	x = 5	x = 5
+=	x += 3	x = x + 3
-=	x -= 3	x = x - 3
*=	x *= 3	x = x * 3
/=	x /= 3	x = x / 3
%=	x %= 3	x = x % 3
&=	x &= 3	x = x & 3
|=	x |= 3	x = x | 3
^=	x ^= 3	x = x ^ 3
>>=	x >>= 3	x = x >> 3
<<=	x <<= 3	x = x << 3

    */

    int savings = 100;
    savings += 50; // add 50 to savings
    System.out.println("Total savings: " + savings);

  //Comparar Strings


    String myStr1 = "Hello";
    String myStr2 = "Hello";
    String myStr3 = "Another String";
    System.out.println(myStr1.equals(myStr2));
    System.out.println(myStr1.equals(myStr3)); //retorna false perqe no son el mateix


}
