public class BinaryCodeSearch {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9,12,43,56};
        int ans = BinarySearch(12,arr);
        System.out.println(ans);
    }
    static int BinarySearch(int target , int []arr) {

        int start = 0;
        int end = arr.length - 1;
        int result = 0;

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
