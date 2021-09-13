package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int big;

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scan1.nextInt();
        big = number1;

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int number2 = scan2.nextInt();
        if(number2>number1){
            big=number2;
        }

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter the third number: ");
        int number3 = scan3.nextInt();
        if(number3>number2){
            big=number3;
        }

        if ((number1 == number2) && (number2==number3) && (number3==number1)){
            System.out.print("Bye!\n");
        }
        else{
            System.out.print("The largest number is " + big + ".");
        }
    }
}
