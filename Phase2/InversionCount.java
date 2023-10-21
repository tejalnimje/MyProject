package Phase2;

public class InversionCount {

    static int count = 0;

    static void mergesort(int[] arr, int start, int end){
        int mid = start + (end-start)/2;

        //Base Case
        if(start >= end){
            return;
        }
        
        //Left Part sorting
        mergesort(arr, start, mid);

        //Right Part sorting
        mergesort(arr, mid+1, end);

        //Merging each parts
        merge(arr, start, end);

    }
    static void merge(int[] arr, int start, int end) {
        int mid = start + (end-start)/2;
        int len1 = mid - start + 1;
        int len2 = end - mid;

        int[] first = new int[len1];
        int[] second = new int[len2];

        int mainIndex = start;
        for(int i=0; i<len1; i++){
            first[i] = arr[mainIndex++];
        }

        mainIndex = mid+1;
        for(int i=0; i<len2; i++){
            second[i] = arr[mainIndex++];
        }

        //Merging 2 sorted arrays
        mainIndex = start;
        int index1 = 0;
        int index2 = 0;

        while(index1 < len1 && index2 < len2){
            // Count logic for Inversion Count Problem
            if(first[index1] > second[index2]){
                count = count + len1 - index1;
                index2++;
            } else {
                index1++;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = { 1, 20, 6, 4, 5 };
        int n = arr.length-1;
        mergesort(arr,0,n);
        System.out.print(count + " ");
    }
}
