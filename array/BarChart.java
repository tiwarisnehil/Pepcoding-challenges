package array;

import java.io.*;
import java.util.*;

public class Main3{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int floor=max;floor>=1;floor--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=floor){
                    System.out.print("*	");
                }else{
                    System.out.print("	");
                }
            }
            System.out.println();
        }
    }

}