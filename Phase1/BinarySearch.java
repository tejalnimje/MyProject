package Phase1;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,4,5,8,9,12,14,27,50};
        int search = 9;
        int index = binarySort(arr,arr.length,search);
        System.out.println("Index of "+ search + " is: " + index);
    }

    private static int binarySort(int[] arr, int length, int search) {
        int start = 0;
        int end = length;
        int mid = start + (end-start)/2;

        while(start<=end){
            if(arr[mid] == search)
                return mid;
            else if(arr[mid]<search)
                start = mid+1;
            else
                end = mid-1;
            mid = start + (end-start)/2;
        }
        return -1;
    }
}
