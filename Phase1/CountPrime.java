package Phase1;

import java.util.Arrays;

public class CountPrime {
    public static void main(String[] args) {
        int n = 40;
        int ans = countPrime(n);
        System.out.println(ans);
    }

    private static int countPrime(int n) {
        int count = 0;
        Boolean[] number = new Boolean[n];
        Arrays.fill(number,true);

        number[0] = number[1] = false;

        for(int i = 2; i < n; i++){
            if(number[i]){
                count++;
                for(int j = i*2; j < n; j= j+i){
                    number[j] = false;
                }
            }
        }
        return count;
    }
}
