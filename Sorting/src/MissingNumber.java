public class MissingNumber {
    public static void main(String[] args) {

        int [] arr = {5,2,3,0,1};
        int ans = missingNumber(arr,4);
        System.out.println(ans);

    }
    static int missingNumber(int [] arr, int n ){
        int i = 0;
        while(i<arr.length){
            int value = arr[i];

            if(arr[i]<arr.length && arr[i] != arr[value]){
                swap(arr,i,value);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int [] arr , int first , int last ){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}


