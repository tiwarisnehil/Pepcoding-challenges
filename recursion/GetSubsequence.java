package recursion;

import java.io.*;
import java.util.*;

public class GetSubsequence {


    public static void main(String[]args)throws Exception{
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList<String>res=gss(str);
        System.out.println(res);
    }
    public static ArrayList<String>gss(String str){
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String>res=gss(ros);

        ArrayList<String>mres=new ArrayList<String>();
        for(Strin rstr:res){
            mres.add(""+ rstr);
        }
        for(Strin rstr:res){
            mres.add(ch+ rstr);
        }
        return mres;
    }

}