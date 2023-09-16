package Basics;
import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int apValue = getAP(n);
        System.out.println("A.P for " + n + " = " + apValue);
        sc.close();
    }

    private static int getAP(int n) {
        return (3*n+7);
    }
}
