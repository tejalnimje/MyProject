package Basics;
import java.util.Scanner;
/**
 * code to get number of notes of each denomination required for the entered amount
 */
public class MyTest {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter int: ");
            int a = sc.nextInt();
            int count100 = 0;
            int count50 = 0;
            int count20 = 0;
            int count1 = 0;
            switch(1){
                case 1: count100 = a/100;
                        a =  a%100;
                            
                case 2: count50 = a/50;
                        a = a%50;
                            
                case 3: count20 = a/20;
                        a = a%20;

                case 4: count1 =a/1;
                        a=a%1;
                        break;
            }
            System.out.println("No. of Rs100 Notes: " + count100 + "\nNo. of Rs50 Notes: " + count50 + "\nNo. of Rs20 Notes: " + count20 + "\nNo. of Rs1 Notes: " + count1);
        }
    }
}