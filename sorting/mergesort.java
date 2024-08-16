import java.util.Arrays;
public class mergesort {
    public static void main(String[] args) {
        int[] arr={10,2,30,5,20,10,85};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second){
        int[] result = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                result[k]=first[j];
                i++;
            }else{
                result[k]=first[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            result[k]=first[i];
            j++;
            k++;
        }
        return result;
    }
}
