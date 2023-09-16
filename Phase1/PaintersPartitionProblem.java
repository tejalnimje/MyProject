package Phase1;

public class PaintersPartitionProblem {
    public static void main(String[] args) {
        int[] arr = {5,17,100,11};
        int n = arr.length;     // length of arr (time required by painter to paint)
        int m = 4;      // No. of painter
        int ans = getPartition(arr, n, m);
        System.out.println(ans);
    }

    private static int getPartition(int[] arr, int n, int m) {
        int s = 0;
        int sum = 0;
        for (int i = 0 ; i<n ; i++)
            sum+=arr[i];
        int e = sum;
        int mid = s + (e-s)/2;
        int ans = 0;
        while(s<=e){
            if(isPossible(arr,n,m,mid)){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int n, int m, int mid) {
        int painterCount = 1;
        int time = 0;
        for(int i=0; i<n; i++){
            if(time + arr[i] <= mid){
                time+=arr[i];
            }else{
                painterCount++;
                if(painterCount > m || arr[i] > mid){
                    return false;
                }
                time = arr[i];
            }
        }
        return true;
    }
}
