public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {3,7,4,1,9};
        int target  = 10;
        int i = 0;
        System.out.println(search(arr,target,i));

    }
    static int search(int[]arr,int target , int i){

       /* if(i == arr.length-1){
            if(arr[i]==target){
                return i;

            }
            else {
                return -1;
            }
        }*/
        //here no array out of bound error cause we are just checking the integer i so if i = arr.length then the element not found
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == target){
            return i;

        }

        return search(arr,target,i+1);
    }
}
