package Phase1;

import java.util.ArrayList;
import java.util.Collections;

public class NinjaCook {
    public static void main(String[] args) {
        ArrayList<Integer> rank = new ArrayList<Integer>();
        rank.add(10);
        //rank.add(2);
        //rank.add(3);
        //rank.add(4);

        int m = 1;

        int ans = minCookTime(rank, m);
        
        System.out.println(ans);
    }

    public static int minCookTime(ArrayList<Integer> rank, int m)
    {
        Collections.sort(rank);
        int s = 0;
        int n = rank.size();
        int e = (m*(m+1)/2)*rank.get(n-1);
        int mid = s + (e-s)/2;
        int ans = -1;
        while(s<=e){
            if(isPossible(rank, m, mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

    static boolean isPossible(ArrayList<Integer> rank, int m, int mid){
        int dish = 0;
        for(int i=0; i<rank.size(); i++){
            int time = 0;
            int count = 1;
            while(time + rank.get(i)*count <= mid){
                if(dish == m)
                    return true;
                time += rank.get(i)*count;
                dish++;
                count++;
            }
        }
        if(dish >= m)
            return true;
        return false;
    }
}
