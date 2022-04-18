package com.github.pepcoding.patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int f1=0;
        int f2=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(f1+"	");
                int temp = f1+f2;
                f1=f2;
                f2=temp;
            }
            System.out.println();
        }

    }
}
