package Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getFiboFor(n);
        sc.close();
    }

    private static void getFiboFor(int n) {
        int a = 0;
        int b = 1;
        if(n==1){
            System.out.println(a +" ");
        }else if(n==2){
            System.out.println(b +" ");
        }else if(n>2){
            int next = 0;
            next = a+b;
            a=b;
            b=next;
            System.out.println(next +" ");
            getFiboFor(n-1);
        }
    }
}
