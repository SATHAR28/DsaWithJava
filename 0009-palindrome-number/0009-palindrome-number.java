class Solution {
    public boolean isPalindrome(int x) {

        int orginal = x;

        int reverse = 0;

        while(x!=0){

            if(x<0){
                return false;
            }

            int digit = x%10;

            reverse = reverse*10+digit;

            x = x/10;



        }

        if(reverse == orginal){
            return true;
        }

        return false;
    }
}