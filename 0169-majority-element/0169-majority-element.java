class Solution {
    public int majorityElement(int[] nums) {
        int maj =  nums.length/2;
        //ArrayList <Integer> list = new ArrayList<>();

        for(int i = 0 ; i<nums.length ; i++){

            int count = 0;

            
            
            for(int j = 0 ; j<nums.length ; j++){
                
                if(nums[i] == nums[j]){

                    //list.add(nums[j]);
                    count++;
                }
                if(count > maj){
                    return nums[i];
                }
                
            }
            /* if(list.size()>maj){
                    return list.get(0);
                }
                else{
                    list.clear();
                }
        }*/
        

        }

       return -1;
    }
}
