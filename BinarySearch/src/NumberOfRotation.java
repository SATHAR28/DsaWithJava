class NumberOfRotation {
    public static void main(String[] args) {
        int [] arr = { 7,10,11,15,2,3,4,5,6}; //rotated sorted array;
        int ans = findPivot(arr);
        System.out.println(ans);
    }

    static int findPivot(int arr[]) {
        // Code here
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if( mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] > arr[mid]){
                end = mid -1;
            }
            else if (arr[start] <= arr[mid]){
                start = mid +1;
            }
        }

        return -1;
    }
    static int findKRotation(int arr[]){
        int pivot = findPivot(arr);

        return pivot+1;
    }
}