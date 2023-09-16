package Phase1;

import java.util.Arrays;

public class Eko {
    public static void main(String[] args) {
        int[] arrHeight = {4,42,40,26,46};  //{20,15,10,17};
        int m = 20;
        int n = arrHeight.length;
        int requiredHeight = getEko(arrHeight,m,n);
        System.out.println(requiredHeight);
    }

    private static int getEko(int[] arrHeight, int m, int n) {
        Arrays.sort(arrHeight);
        int s = 0;
        int e = m; // Required wood height
        int mid = s + (e-s)/2;
        int ans = -1;
        while(s<=e){
            int sawHeight = arrHeight[n-1]-mid; // Max height - mid of search space
            if(isPossible(arrHeight,m,n,sawHeight)){
                ans = sawHeight;
                e = mid-1;
            }else{
                s = mid+1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

    private static boolean isPossible(int[] arrHeight, int m, int n, int sawHeight) {
        int total = 0;
        for(int i = 0; i<n ; i++){
            if(arrHeight[i] - sawHeight > 0){
                total = total + (arrHeight[i] - sawHeight);
            }
        }
        if(total>=m){
            return true;
        }
        return false;
    }
}
