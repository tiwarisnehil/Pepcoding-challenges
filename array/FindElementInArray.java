package array;

import java.io.*;
import java.util.*;

public class main2{

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int [] arr= new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int d=scn.nextInt();
        int flag = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==d){
                System.out.println(i);
                flag=1;
                break;
            }

        }
        if(flag==0){
            System.out.println(-1);
        }
    }
}
