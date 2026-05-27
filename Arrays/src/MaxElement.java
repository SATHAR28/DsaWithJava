public class MaxElement {
    public static void main(String[] args) {
        int arr[] = {2 , 3 , 4 , 5};
//        int ans = max(arr);
//        System.out.println(ans);
        max(arr);

    }
    static void max(int arr[]){
        int max = arr[0];
        for(int i =1 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}
