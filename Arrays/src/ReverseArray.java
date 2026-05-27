import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {3 ,4 , 1 , 7 ,2 ,3};
        reverse(arr);

    }
    static void reverse(int arr[] ){
        int start = 0;
        int end = arr.length-1;
        int temp = 0;
        while (start < end){
            temp = arr [start];
            arr[start] = arr[end] ;
            arr [end] = temp;
            start ++;
            end --;
        }
        System.out.println(Arrays.toString(arr));



    }
}
