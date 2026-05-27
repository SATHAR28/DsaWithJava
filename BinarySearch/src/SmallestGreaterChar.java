public class SmallestGreaterChar {
    public static void main(String[] args) {
        char [] arr = { 'a','c','f','h','j','k','z'};
        char target = 'f';
        char result = StictlyGreater(arr,target);
        System.out.println(result);
    }

    static char StictlyGreater(char [] arr , char target){
        int start =  0;
        int end = arr.length-1;

        while(start <= end ){
            int mid = (start + end) / 2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else{
                start = mid +1 ;


            }
        }
        return arr [start%arr.length];
    }
}
