package com.company;

import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int [in.nextInt()];
        int c=0;
        int max = 100;
        for (int i=0;i<a.length;i++){
            a[i]=(int) (Math.random() *(max+1));
            c=a[i]+c;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("\n"+c);
    }
}