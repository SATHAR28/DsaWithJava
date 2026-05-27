import java.util.Arrays;

public class TryReverse {
    public static void main(String[] args) {
        int [] arr = { 1 ,2 ,3, 4, 5, 6};
        int [] result = reverse(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] reverse(int [] arr){
        int start = 0;
        int end = arr.length-1;
        int temp = 0 ;
        while (start<=end ){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end -- ;
        }
        return arr;
    }
}
