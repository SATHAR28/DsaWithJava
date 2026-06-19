import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int nums []  = {4,3,2,7,8,2,3,1};
        int n = nums.length;
        System.out.println((findDisappearedNumbers(nums,n)));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums , int n) {

        int i = 0;
        int missing[] = new int[5];
        while(i<nums.length){
            int value = nums[i] - 1;
            if(nums[i]<=nums.length && nums[i] != nums[value]) {

                swap(nums,i,value);
            }
            else{
                i++;
            }

        }
        List<Integer> ans  = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!= j+1){
               ans.add(j+1);
            }
        }

       return ans;
    }
    static void swap(int [] arr , int first , int last ){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
