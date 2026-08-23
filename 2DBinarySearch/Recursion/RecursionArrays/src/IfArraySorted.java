public class IfArraySorted {
    public static void main(String[] args) {
        int[] arr  = {1,2,7,4,5};
        int i = 0;
        System.out.println(isSorted(arr,i));

    }
    static boolean isSorted(int[] arr , int i){

        if(i == arr.length-1){
            return true;
        }


        return arr[i] < arr[i+1] && isSorted(arr,i+1);
    }
}
