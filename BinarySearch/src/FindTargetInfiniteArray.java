public class FindTargetInfiniteArray {
    public static void main(String[] args) {

        int arr[] = { 1,4,6,9,10,21,22,25,29,31,36,38,39,45,54,60,68,100,123};
        int target = 38;
        int result = ans(arr,target);
        System.out.println(result);

    }

    static int ans (int arr[] , int target ){
        int start = 0;
        int end = 1;

        while(arr[end] < target ){
            int newStart = end+1;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return BinarySearch(target,arr , start , end );
    }

    static int BinarySearch(int target , int []arr , int start , int end ) {

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
}
