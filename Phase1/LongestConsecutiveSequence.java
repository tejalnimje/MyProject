package Phase1;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }
    
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int start = nums[0];
        int count = 0;
        int ans = 0;
        for(int i = 0; i <nums.length; i++){
            if(nums[i] == start){
                count++;
                start++;
                if(ans < count){
                    ans = count;
                }
            } else if(nums[i] != start && nums[i] != start-1){
                start = nums[i] + 1; // assigning next element to continue sequence
                count = 1; // Starting count again with present element
            }
        }
        return ans;
    }
}
