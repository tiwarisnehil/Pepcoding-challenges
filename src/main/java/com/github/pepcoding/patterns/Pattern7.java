package com.github.pepcoding.patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int spc=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("	");
            }
            spc++;
            System.out.print("*	");
            System.out.println();
        }


    }
}
