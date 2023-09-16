package Phase1;
import java.util.Arrays;

public class AggressiveCows {
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int s = 0;
        int maxi = stalls[-1];   //last element of the sorted arr
        int e = maxi;
        int mid = s + (e-s)/2;
        int ans = -1;
        while(e<=s){
            if(isPossible(stalls,k,mid)){
                ans = mid;
                s = mid + 1;
            }else{
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

    static boolean isPossible(int []stalls, int k, int mid){
        int cowCount = 1;
        int lastPos = stalls[0];
        for(int i=0; i<stalls.length; i++){
            if(stalls[i]-lastPos >= mid){
                cowCount++;
                if(cowCount==k)
                    return true;
                lastPos = stalls[i];
            }
        }
        return false;
    }
}