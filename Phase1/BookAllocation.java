package Phase1;

public class BookAllocation {
    public static void main(String[] args) {
        int[] arr = {5,17,100,11};
        int n = arr.length;     // length of arr (no. of books)
        int m = 4;      // No. of students
        int ans = allocateBooks(arr, n, m);
        System.out.println(ans);

    }

    private static int allocateBooks(int[] arr, int n, int m) {
        int s = 0;
        int sum = 0;
        for(int i = 0; i< n; i++){
            sum = sum + arr[i];
        }
        int e = sum;
        int mid = s + (e-s)/2;
        int ans = 0;
        while(s<=e){
            if(isPossible(arr,n,m,mid)){
                ans = mid;
                e=mid-1;
            }
            else
                s=mid+1;
            mid = s + (e-s)/2;
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int n, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;
        for(int i = 0; i<n;i++){
            if(pageSum + arr[i] <= mid){
            pageSum = pageSum + arr[i];
            }
            else{
                studentCount++;
                if(studentCount > m || arr[i] > mid)    {
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }
}
