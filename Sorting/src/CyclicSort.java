import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};
        int [] ans  = Cyclic(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int [] Cyclic(int[] arr){ // This doesnt work when the array has a duplicate value For that we have to follow Kunals approach !!

        int i = 0;
        while(i<arr.length){
            int value = arr[i] - 1;
            if(i == value ) {
                i++;
            }
            else{
                swap(arr,i,value);
            }
        }
        return arr;
    }
    static void swap(int [] arr , int first , int last ){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
