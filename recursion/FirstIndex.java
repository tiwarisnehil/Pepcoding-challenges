package recursion;
import java.io.*;
import java.util.*;

public class FirstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int d=scn.nextInt();
        int ans=firstIndex(arr,0,d);
        System.out.println(ans);

    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }

        int a=firstIndex(arr,idx+1,x);
        if(arr[idx]==x){
            return idx;
        }else{
            return a;
        }
    }

}