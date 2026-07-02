public class BinarySearch {
    public static void main(String[] args) {
        int arr [] =  {2,5,7,9,14,25,32};
        int target= 32 ;
        int ans = Bs(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    static int Bs(int[] arr , int target , int start , int end){

        if(start>end){
            return -1;
        }

        int mid = start + (end - start )/2;

        if(arr[mid] == target){
            return mid;
        }
        else if (target < arr[mid]){
           return Bs(arr,target,start,mid-1);
        }
        else{
            return Bs(arr,target,mid+1,end);
        }




    }
}
