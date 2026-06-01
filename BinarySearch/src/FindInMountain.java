public class FindInMountain {

    public static void main ( String args[]){
        int [] arr = { 1 , 2 , 3 , 4 , 5 , 3 , 1};
        int target = 5;
        int result = searchIndex(arr,target);
        System.out.println(result);
    }

    static  int peakElememt(int [] arr){
        int start  = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }

    static int searchIndex(int [] arr , int target){
        int peak = peakElememt(arr);
        int first_try = BinarySearch(target , arr , 0 , peak);

        if(first_try !=-1){
            return first_try;
        }
        int second_try = NBinarySearch(target , arr , peak+1 , arr.length-1);

        return second_try;
    }

    static int BinarySearch(int target , int []arr , int start , int end) {


        while(start <= end ) {
            int mid = (start + end ) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }

        }
        return -1;
    }
    static int NBinarySearch(int target , int []arr , int start , int end) {


        while(start <= end ) {
            int mid = (start + end ) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
               end = mid - 1;
            }

        }
        return -1;
    }
}


