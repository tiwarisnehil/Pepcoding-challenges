package array;


import java.io.*;
import java.util.*;

public class CeilAndFloor{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int data=scn.nextInt();
        int lo=0;
        int hi=arr.length-1;
        int floor=0;
        int ceil=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(data>arr[mid]){
                lo=mid+1;
                floor=arr[mid];
            }
            else if(data<arr[mid]){
                hi=mid-1;
                ceil=arr[mid];
            }else{
                floor=arr[mid];
                ceil=arr[mid];
                break;
            }

        }
        System.out.println(ceil);
        System.out.println(floor);
    }

}
