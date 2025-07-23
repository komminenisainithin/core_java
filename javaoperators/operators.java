package javaoperators;
// Java operators are special symbols used to perform operations on variables and values.
//  -> Values - Operands
//  -> Symbols - Operators
public class operators {
    public static void main(String[] args){
        // Arithmetic Operators
        byte a=10,b=20;
        int sum= a+b;
        System.out.println("sum of a and b is :" + sum);
        System.out.println("subtraction of a ana b is :" + (b-a) );
        System.out.println("multiplication of a ans b is :"+ (a*b));
        System.out.println("division of a and b is :"+(b/a));
        System.out.println("modulus of a and b is :"+ (b%a));

        //Increment / Decrement Operators
        // Used to increase or decrease the value of a variable by `1
        //++ (increment) - increases the value of a variable by 1
        //--(decrement) - decreases the value of a variable by 1
        // pre-increment - increases the value before using it in an expression
        //post-increment - increases the value after using it in an expression
        // pre-decrement - decreases the value before using it in an expression
        //post-decrement - decreases the value after using it in an expression
        int x=5;
        System.out.println("original value of x is :"+ x);
        System.out.println("x pre-increment is :"+ (++x) );
        System.out.println("x post-increment is : "+(x++));
        System.out.println("value of x after post-increment is :"+ x);
        System.out.println("x pre-decrement is :"+(--x));
        System.out.println("x post-decrement is :"+(x--));
        System.out.println("value of x after post-decrement is"+x);


        // Assignment Operators
        // used to assign values to variables
        // = (assignment) - assigns the value on the right to the variable on the left
        // += (add and assign) - adds the right operand to the left operand and assigns the result to the left operand
        // -= (subtract and assign) - subtracts the right operand from the left operand and assigns the result to the left operand 
        // *= (multiply and assign) - multiplies the left operand by the right operand and assigns the result to the left operand
        // /= (divide and assign) - divides the left operand by the right operand and assigns to the left operand
        // %= (modulus and assign) - takes the modulus of the left operand by the right operand and assigns the result to the left operand
        int y=10;
        System.out.println("original value of y is :"+y);
        y +=5; //y=y+5
        System.out.println("y after add and assign is :"+y);
        y-=3;// y = y - 3
        System.out.println("y after subtract and assign is : "+ y);
        y*=2; // y = y* 2
        System.out.println("y after multiply and assign is :"+ y);
        y/=4; // y = y/4
        System.out.println("y after divide and assign is :"+ y);
        y%=3; // y  = y%3
        System.out.println("y after modulus and assign is :"+y);


        // Relational operators
        System.out.println("a is greater than b :"+ (a>b));
        System.out.println("a is less than b :"+ (a<b));
        System.out.println("a is equal to b :"+ (a==b));
        System.out.println("a is not equal to b :"+ (a!=b));
        System.out.println("a is greater than or equal to b :"+ (a>=b));
        System.out.println("a is less than or equal to b :"+ (a<=b));
        // Logical Operators
        // Used to combine or modify boolean expressions.
        // && (logical AND)-returns true, if both(multiple) conditions are true
        // || (logical OR)-returns true, if one of the conditions is true
        //! (NOT)  - inverts, true is false and false is true
        //     X       Y       X && Y      X || Y      !X      !Y
        //     T       T         T            T         F       F
        //     T       F         F            T         F       T    
        //     F       T         F            T         T       F
        //     F       F         F            F         T       T

        boolean n = true, p= false;
        System.out.println("x && y is : "+ (n && p));
        System.out.println("x || y is :"+ (n || p));
        System.out.println("!x is :"+ !n);
        System.out.println("!y is :"+ !p);

        // Bitwise Operators
        // Used to perform operations on bits and binary numbers(0s and 1s).
        // & (bitwise AND) - returns 1 if both bits are 1,
        // | (bitwise OR) - returns 1 if at least one bit is 1,
        // ^ (XOR) - Sets each bit to 1, if only one of the bits is 1
        //                - if both values are different then output is 1
        //                - if both values are same then output is 0
        // ~ (bitwise NOT) - inverts the bits, 0 becomes 1 and 1 becomes 0
        // << (left shift) - shifts bits to the left by a specified number of positions
        // >> (right shift) - shifts bits to the right by a specified number of positions
        int num1=5, num2=3;
        System.out.println("num1 & num2 is :"+ (num1 & num2));
        System.out.println("num1 | num2 is :"+ (num1 | num2));
        System.out.println("num1 ^ num2 is :"+ (num1 ^ num2));
        System.out.println("~ num1 is :"+ (~num1));
        System.out.println("num1 << 2 is :"+ (num1 << 2));
        System.out.println("num1 >> 2 is : "+ (num1 >> 2 ));

        // Ternary Operator
        // A shorthand way to write an if-else statement.
        // Syntax: condition ? expression1 : expression2
        int age = 18;
        String eligibility = (age >=18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Voting eligibility:"+ eligibility);

        // Instanceof operator
        // Used to test whether an object is an instance of a specific class or interface.
        // Syntax: object instanceof class/interface
        String str="hello";
        boolean isString = str instanceof String;
        System.out.println("Is str an instance of String? "+ isString);
        // Type Casting
        // Converting a variable from one data type to another.
        // Implicit Casting (widening conversion) - automatic conversion from a smaller data type to a larger data type
        int intvalue = 100;
        long longValue = intvalue; // int to long
        System.out.println("long value after implicit casting:"+ longValue);
        // Explicit Casting (narrowing conversion) - manual conversion from a larger data type to a smaller data type
        double doubleVlaue = 9.78;
        int intvalueFromDouble = (int) doubleVlaue; // double to int
        System.out.println("int value after explicit casting:"+ intvalueFromDouble);
        

    }
    
}
