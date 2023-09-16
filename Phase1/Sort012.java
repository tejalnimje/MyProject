package Phase1;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {2,1,0,1,0,2,2,0,0,1,2,1};

        sortArrayy(arr);
        printarray(arr);

    }

    private static void sortArrayy(int[] arr) {
        int i=0;
        int j=0;
        int k=arr.length-1;
        while(j<=k){
            if(arr[j]==0){
                swap(arr,i,j);
                i++;
                j++;
            }else if(arr[j]==2){
                swap(arr,j,k);
                k--;
            }else if(arr[j]==1){
                j++;
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printarray(int[] arr) {
        for(int a : arr)
            System.out.print(a +" ");
        System.out.println("");
    }
}
