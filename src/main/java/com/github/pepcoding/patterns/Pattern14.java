package com.github.pepcoding.patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=10;i++){
            int k=n*i;
            System.out.println(n + " * "+ i + " = " + k);
        }


    }
}
