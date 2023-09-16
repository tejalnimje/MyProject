package Phase1;

public class FindSqrtUsingBinarySearch {
    public static void main(String[] args) {
        int n = 10000;
        int ans = binarySearch(n);
        System.out.println("Sqrt of " + n + ": " + ans);
    }

    private static int binarySearch(int n) {
        int s = 0;
        int e = n;
        int mid = s + (e-s)/2;
        int ans = -1;
        while(s<=e){
            long square = mid*mid;
            if(square == n)
                return mid;
            if(square<n){
                ans = mid;
                s = mid+1;
            }
            else
                e = mid-1;
            mid = s + (e-s)/2;
        }
        return ans;
    }
}
