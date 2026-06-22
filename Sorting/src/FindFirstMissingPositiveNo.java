//this is leetcode hard but nothing but the same logic as missing number problem but we ignore the 0 and -1!!
public class FindFirstMissingPositiveNo {
    public int firstMissingPositive(int[] nums) {
        int i  = 0 ;
        while (i<nums.length){
            int value =  nums[i] -1 ;
            if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[value]){
                swap(nums,i,value);
            }
            else{
                i++;
            }

        }
        for(int j = 0 ; j<nums.length ; j++){
            if (nums[j]!=j+1){
                return j+1;
            }

        }
        return nums.length+1; // if nums = {1,2,3,4} then the first missing positive no is 5 that's why nums.length+1 which returns 5;
    }
    void swap (int nums[] , int first , int second){
        int temp = 0 ;
        temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
