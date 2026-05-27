public class MaxInRange {
    public static void main(String[] args) {
        int[] arr = { 2 ,3 ,1 , 8 ,23,4};

        System.out.println( maxRange(arr,2,5));

    }
    static int maxRange(int[] arr , int start , int end ){
        int max = arr[start];
        for(int i = start + 1  ; i<=end ; i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;

    }

}
