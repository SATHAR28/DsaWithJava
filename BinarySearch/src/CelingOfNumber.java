public class CelingOfNumber {
    public static void main(String[] args) {
        int [] arr = { 1 , 2 , 4,  6, 8, 9, 11 ,13};
        int ans = Celing(arr,6);
        System.out.println(ans);
    }
    static int Celing (int [] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start +end) / 2;
            if (target == arr[mid]){
                return mid;
            }
            else if( target < arr[mid] ){
                end = mid -1 ;
            }
            else if (target > arr[mid] ){
                start = mid + 1 ;
            }
        }
        return start;
    }
}
