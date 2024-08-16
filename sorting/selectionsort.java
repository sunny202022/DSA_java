import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={10,2,30,5,20,10,85};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int last =arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int arr[],int start,int end){
        int maxIndex=start;
        for (int i = start; i <= end; i++) {
            if(arr[maxIndex]<arr[i]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]=temp;
    }
}
