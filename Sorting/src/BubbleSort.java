import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        int [] result = BubbleSortAlgo(arr);
        System.out.println(Arrays.toString(result));
    }
    static int [] BubbleSortAlgo(int [] arr){
        int temp = 0;
        boolean swaped;
        for(int i = 0 ; i<=arr.length-1;i++){
            swaped = false;
            for (int j = 1; j < arr.length-i ; j++) {

                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }

            }
            if(swaped == false){
                break;
            }
        }

        return arr;
    }
}
