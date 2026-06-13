import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {-32,-50,0,2,7,100};
        int ans [] = insertion(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int [] insertion(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0  ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }

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
