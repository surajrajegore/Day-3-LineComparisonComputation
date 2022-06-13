package com.bridgelabz;

import java.util.Scanner;

public class LineComputation {
    Scanner sc = new Scanner(System.in);
    public float insertCoOrdinates()
    {
        System.out.println("Enter value of x1:");
        int x1 = sc.nextInt();
        System.out.println("Enter value of x2:");
        int x2 = sc.nextInt();
        System.out.println("Enter value of y1:");
        int y1 = sc.nextInt();
        System.out.println("Enter value of y2:");
        int y2 = sc.nextInt();

        return (float)(Math.sqrt((x2-x1)*(x2-x1)+((y2-y1)*(y2-y1))));
    }
    public static void main(String[] args)
    {

        System.out.println("Welcome to line comparison computation program");
        LineComputation line1 = new LineComputation();
        LineComputation line2 = new LineComputation();

        if(line1.insertCoOrdinates() > line2.insertCoOrdinates())
        {
            System.out.println("line1 is greater ....");
        }
        else
        {
            System.out.println("line 2 is greater");
        }

    }
}
