class Solution {
    public String largestOddNumber(String num) {

        /*int nums = Integer.parseInt(num);

        if(nums%2!=0){
            return Integer.toString(nums);
        }
        /*
        int max = 0;

        int combine = 0;

        while(nums>0){

            int digit = nums%10;
            
            int combine = combine*10+digit

            

            if(digit%2!=0 && digit > max){

                max = digit;

            }
            
            nums = nums/10;

        }
        if (max == 0){
            return "";
        }
        
        return Integer.toString(max);
        */
      
        for (int i = num.length() - 1; i >= 0; i--) {

            char ch = num.charAt(i);

            if ((ch - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}