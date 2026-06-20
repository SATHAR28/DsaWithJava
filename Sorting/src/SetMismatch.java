public class SetMismatch {

    // Leetcode Problem
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int value = nums[i] -1;

            if(nums[i] != nums[value]){
                swap(nums , i , value);
            }
            else{
                i++;
            }
        }
        int [] ans = new int[2];
        for(int j = 0 ; j<nums.length ; j++){

            if(nums[j]!=j+1){

                ans[0] = nums[j];
                ans [1] = j+1;

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
