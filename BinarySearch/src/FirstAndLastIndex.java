import java.util.Arrays;

public class FirstAndLastIndex{
    public static void main(String[] args) {

        int [] nums = { 5 , 7 , 7 , 8 , 8 , 10};
        FirstAndLastIndex o = new FirstAndLastIndex();
        int result [] = o.searchRange(nums , 12);
        System.out.println(Arrays.toString(result));

    }

    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1 ;
        int start = 0;
        int end = nums.length-1;
        while(start<=end ) {
            if (nums[start] == target) {
                first = start;
                break;

            }
            start++;
        }
        while(start<=end) {
            if (nums[end] == target) {
                last = end;
                break;
            }

            end--;
        }

        return new int[]{first,last};




    }
}