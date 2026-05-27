public class GreatestSmallerChar {
    public static void main(String[] args) {
        char[] arr = { 'a' , 'b' ,'d','f','g','l','m'};
        char target = 'a';
        char ans = StricltySmaller(arr , target);
        System.out.println(ans);
    }
    static char StricltySmaller(char [] arr , char target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start) /2;

            if(target>arr[mid]){
                start = mid +1 ;
            }
            else{
                end = mid -1;
            }

        }
        return arr[arr.length-1%end];
    }
}
