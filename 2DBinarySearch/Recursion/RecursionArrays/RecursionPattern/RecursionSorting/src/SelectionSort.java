public class SelectionSort {
    public static void main(String[] args) {
        int []  arr = {3,5,2,7};
        int i = 1;
        int j = arr.length-1;
        int max = 0;
        System.out.println(Max(arr,i,max));

    }

    static void sort(int[] arr,int F_index,int L_index){



    }


//finding MAx Index using Recursion
    static int Max(int[]arr,int i , int max){

        if(i== arr.length){
            return max;
        }

        if(arr[i]>arr[max]){
            return Max(arr,i+1,i);
        }
        return Max(arr,i+1,max);
    }
}
