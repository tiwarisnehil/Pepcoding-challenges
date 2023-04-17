package array;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = DecimalToAnyBase(n, b);
        System.out.println(dn);
    }
public class DecimalToAnyBase(int n,int b) {
    int sum=0;
    int p = 1;
    while(n>0){
        int dig=n%b;
        n=n/b;
        sum = sum + dig*p;
        p=p*10;
    }
    return sum;

}
}
