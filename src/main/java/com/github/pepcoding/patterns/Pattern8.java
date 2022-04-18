package com.github.pepcoding.patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spc = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spc; j++) {
                System.out.print("	");
            }
            System.out.print("*	");
            System.out.println();
            spc--;

        }
    }
}