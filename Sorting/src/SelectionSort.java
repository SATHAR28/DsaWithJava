import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {3,7,0,1,5};
        int ans [] = Selection(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Selection(int [] arr ){

        for (int i = 0; i < arr.length; i++) {
            int first = 0 ;
            int last = arr.length-i-1;
            int maxIndex = maxElement(arr,0,last);
            swap(arr,maxIndex,last);
        }
        return arr;
    }
    static int maxElement(int[]arr , int start , int last){
        int max = start;
        for(int i = 1 ; i<=last ;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int [] arr , int maxIndex , int last ){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}
