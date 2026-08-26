import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,1,5,4,6};
        int i = 0;
        int j = i+1;
        Sort(arr,i,j);
        
    }
    static void Sort(int[] arr , int i ,int j){

        if(i == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        if(j<arr.length){
            if(arr[j] < arr[j-1]){
                swap(arr,j,j-1);
                 Sort(arr,i,j+1);

            }
            else{
                Sort(arr,i,j+1);
            }
        }
        else{
            
            Sort(arr,i+1,1);
        }

             


    }
    static void swap (int [] arr , int first , int second){
        int temp = 0;

        temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

