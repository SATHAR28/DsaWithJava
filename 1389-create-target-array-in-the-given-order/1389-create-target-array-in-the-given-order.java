class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList <Integer> list = new ArrayList<>();

       

        for(int i = 0 ; i< nums.length ; i++){

                list.add(index[i],nums[i]);
        }
         int target[] = new int[list.size()];
        for(int k = 0 ; k<target.length;k++){
            target[k] = list.get(k);
        }

        return target;
        
    }
}