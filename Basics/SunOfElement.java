package Basics;

import java.util.Scanner;

public class SunOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size: ");
        int size = sc.nextInt();
        int sum = 0;
        int[] arr = new int[100];
        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
            sum += arr[i]; 
        }
        System.out.println("Sum: " +sum);
        sc.close();
    }
}
