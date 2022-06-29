import java.util.Scanner;

public class Day2_1 {
    public static void main(String[] args) {

        //task 1  Ask user to input two numbers, compare them and output result:

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("Enter value a:");
        double input1 = input.nextDouble();
        System.out.print("Enter value b:");
        double input2 = input.nextDouble();
        System.out.print("is " + input1 + " equal to " + input2 + "? - ");
        if(input1 == input2){
            System.out.println("true");
        }
        else System.out.println("false");

        System.out.print("is " + input1 + " less than " + input2 + "? - ");
        if(input1 < input2){
            System.out.println("true");
        }
        else System.out.println("false");

        System.out.print("is " + input1 + " less or equal to " + input2 + "? - ");
        if(input1 <= input2){
            System.out.println("true");
        }
        else System.out.println("false");

        System.out.print("is " + input1 + " greater than " + input2 + "? - ");
        if(input1 > input2){
            System.out.println("true");
        }
        else System.out.println("false");

        System.out.print("is " + input1 + " greater or equal to " + input2 + "? - ");
        if(input1 >= input2){
            System.out.println("true");
        }
        else System.out.println("false");

        //task 2  Ask user to input two boolean values and compare them.

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 2 boolean values");
        System.out.print("Enter value b1:");
        boolean a = inp.nextBoolean();
        System.out.print("Enter value b2:");
        boolean b = inp.nextBoolean();
        if(a == b){
            System.out.println("is b1 and b2 equal? - true ");
        }
        else System.out.println("is b1 and b2 equal? - false ");

        // task 3  Ask user to input a whole number and output true,
        // if it is even number and false if it is odd number

        Scanner inp2 = new Scanner(System.in);
        System.out.println("Enter whole number");
        int c = inp2.nextInt();
        if(c % 2 == 0){
            System.out.println("true");
        }
        else System.out.println("false");

        //task 4  Ask user to input a whole number and output false,
        // if it is even number and true if it is odd number

        Scanner inp3 = new Scanner(System.in);
        System.out.println("Enter whole number");
        int d = inp3.nextInt();
        if(d % 2 == 0){
            System.out.println("false");
        }
        else System.out.println("true");

        //task 5  Write a program which reads boolean value from user
        // and prints out the opposite value:

        Scanner inp4 = new Scanner(System.in);
        System.out.print("Enter boolean value:");
        boolean e = inp4.nextBoolean();
        System.out.println("Opposite of \"" + e + "\" is \"" + !e + "\"");

        //task 6  Write a program which asks the user to input two whole
        // numbers a and b. Output "true", if one of this condition is true:
        //    1) a and b is equal
        //    2) a is less than 0 and b is greater than 0
        //    3) both of them are greater than 100

        Scanner inp5 = new Scanner(System.in);
        System.out.println("Enter 2 whole numbers");
        int f = inp5.nextInt();
        int g = inp5.nextInt();
        boolean abEqual = false;
        boolean lessGreater = false;
        boolean over = false;
        if(f == g){ abEqual = true; }
        if(f < 0 && g > 0){ lessGreater = true; }
        if(f > 100 && g > 100){ over = true; }
        if(abEqual || lessGreater || over){
            System.out.println("true");
        }else System.out.println("false");

    }
}
