package array;


import java.io.*;
import java.util.*;

public class Main{

    public static void SubArrayProblem(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] a = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + "	");
                }
                System.out.println();
            }
        }
    }

}