package stacks;

import java.io.*;
        import java.util.*;

public class InfixEvaluation{


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer>opnds=new Stack<>();
        Stack<Character>optors=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='('){
                optors.push(ch);
            }else if(Character.isDigit(ch)){
                opnds.push(ch-'0');
            }else if(ch==')'){
                while(optors.peek()=='('){
                    char opt=optors.pop();
                    int v2=opnds.pop();
                    int v1=opnds.pop();

                    int opv=operation(v1,v2,opt);
                    opnds.push(opv);
                }
                optors.pop();
            }else if(ch=='+' || ch=='-' || ch=='*'||ch=='/'){
                while(optors.size()>0 && optors.peek()!='(' && precedence(ch)<=precedence(optors.peek())){
                    char opt=optors.pop();
                    int v2=opnds.pop();
                    int v1=opnds.pop();

                    int opv=operation(v1,v2,opt);
                    opnds.push(opv);
                }
                optors.push(ch);
            }
        }
        while(optors.size()>0){
            char opt=optors.pop();
            int v2=opnds.pop();
            int v1=opnds.pop();

            int opv=operation(v1,v2,opt);
            opnds.push(opv);
        }
        System.out.println(opnds.peek());

    }


    public static int precedence(char ch){
        if(ch=='+'){
            return 1;
        }else if(ch=='-'){
            return 1;
        }else if(ch=='*'){
            return 2;
        }else{
            return 2;
        }
    }
    public static int operation(int v1,int v2,char ch){
        if(ch=='+'){
            return v1+v2;
        }else if(ch=='-'){
            return v1-v2;
        }else if(ch=='*'){
            return v1*v2;
        }else{
            return v1/v2;
        }
    }
}