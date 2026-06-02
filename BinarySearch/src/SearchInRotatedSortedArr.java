public class SearchInRotatedSortedArr {
    public static void main(String[] args) {
        SearchInRotatedSortedArr s = new SearchInRotatedSortedArr();
        int [] arr = {4,5,6,7,0,1,2}; // rotated sorted array
        int target = 0;
        int ans = s.FindTarget(arr,target);
        System.out.println(ans);
    }

    int FindPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end ){
            int mid = start + (end-start) / 2;
            if( mid < end && arr[mid] > arr[mid+1]){ //if in case mid is last element in the array if it performs this case it sees for mid +1 that is indexOutofBound , thus we use mid>end && here
                return mid;
            }
            else if ( mid>start && arr[mid] < arr[mid-1]){//samer logic here if the mid is first elememt we cant perform this case!!
                return mid-1;
            }
            else if( arr[start] >= arr[mid] ){
                end = mid -1;
            }
            else if (arr[start] < arr[mid]){

                start = mid+1;
            }
        }
        return -1;
    }
    int FindTarget(int[] arr ,int target){
        int pivot = FindPivot(arr);

            int first_half = BinarySearch(target, arr, 0, pivot);
            if(first_half !=-1) {
                return first_half;
            }

        int second_half = BinarySearch(target, arr,pivot+1, arr.length-1);

        return second_half;

    }

    static int BinarySearch(int target , int []arr, int start , int end) {

        while(start <= end ) {
            int mid = start + (end-start) / 2;
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
}
