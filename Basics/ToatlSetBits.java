package Basics;

import java.util.Scanner;

public class ToatlSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        count = count + getBitCount(a);
        count = count + getBitCount(b);
        System.out.println(" Total Bit Count (No. of 1's) for " + a + " and " + b + " : " + count);
        sc.close();
    }

    private static int getBitCount(int num) {
        int count = 0;
        while (num!=0){
            if((num & 1) == 1)
                count++;
            num = num >> 1;
        }
        return count;
    }
}
