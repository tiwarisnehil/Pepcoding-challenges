package string;
import java.io.*;
import java.util.*;

public class StringCompression {

    public static String compression1(String str){
        String s =str.charAt(0)+"";

        for(int i=1;i<str.length();i++){
            char c1=str.charAt(i);
            char c2=str.charAt(i-1);

            if(c1!=c2){
                s+=c1;
            }
        }
        return s;


    }

    public static String compression2(String str){
        String s =str.charAt(0)+"";
        int count=1;
        for(int i=1;i<str.length();i++){
            char c1=str.charAt(i);
            char c2=str.charAt(i-1);

            if(c1==c2){
                count++;
            }else{
                if(count>1){
                    s+=count;
                    count=1;
                }
                s+=c1;
            }
        }
        if(count>1){
            s+=count;
            count=1;
        }
        return s;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}