import java.util.ArrayList;
import java.util.List;
//LeetCode Problem Aswell!!
public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {

        int i = 0 ;
        while(i<nums.length){
            int value = nums[i] - 1;
            if(nums[i] != nums[value]){
                swap(nums,i,value);
            }
            else{

                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j = 0 ; j<nums.length ; j++){
            if(nums[j] != j+1){

                ans.add(nums[j]);

            }
        }
        return ans;

    }
    void swap (int nums[] , int first , int second){
        int temp = 0 ;
        temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
