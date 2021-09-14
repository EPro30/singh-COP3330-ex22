/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
import static java.lang.System.exit;

public class exComparingNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();

        int largeNum =0;
        if(a == b && b == c) //checking the validity of input by comparing the numbers
        {
            exit(1); //exiting the program
        }
        else
        {
            if(a > b && a > c) //Determining the largest number
            {
                largeNum = a;
            }
            else if(b > a && b > c)
            {
                largeNum = b;
            }
            else if(c > a && c > b)
            {
                largeNum = a;
            }
        }
        System.out.println("The largest number is " + largeNum + ".");
    }
}
