package com.github.pepcoding.patterns;
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int spc=n-1;
        int str=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("	");
            }
            for(int j=1;j<=str;j++){
                System.out.print("*	");
            }
            spc--;
            str++;
            System.out.println();
        }
    }
}
