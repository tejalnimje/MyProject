package Phase1;

public class SwapAlternateElementsInArray {
    public static void main(String[] args) {
        int arr[] = {1,5,9,-1,4,8,3,6};
        arraySwap(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i] + " ");
    }

    private static void arraySwap(int[] arr) {
        for(int i=0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        
    }
}
