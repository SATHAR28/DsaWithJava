
//LeetCode Probmen Find Duplicate Number
class FindDuplicates {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int value = nums[i] -1;

            if(nums[i] != nums[value]){
                swap(nums,i,value);
            }
            else{
                i++;
            }
        }
        int duplicate = 0 ;
        for(int j = 0 ; j<nums.length ; j++){

            if(nums[j] != j+1){
                return nums[j];
            }

        }
        return -1;


    }
    void swap (int nums[] , int first , int second){
        int temp = 0 ;
        temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}