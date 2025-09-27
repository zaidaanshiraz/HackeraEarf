//Ques->https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-6-official/ojquestion

//Code->
//package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int dec=(n/2)+1;
        for(int i=1;i<=(n/2)+1;i++)
        {
            for(int j=1;j<=dec;j++)
                System.out.print("*	");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("	");
            for(int j=1;j<=dec;j++)
                System.out.print("*	");
            System.out.println();
dec--;

        }
        int inc=2;
        dec=n-2;
        for(int i=(n/2)+2;i<=n;i++)
        {
            for(int j=1;j<=inc;j++)
                System.out.print("*	");
            for(int j=1;j<=dec;j++)
                System.out.print("	");
            for(int j=1;j<=inc;j++)
                System.out.print("*	");
            System.out.println();
            inc++;
            dec=dec-2;

        }

    }
}