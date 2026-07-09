class Solution {
    public boolean isPalindrome(String s) {

        
        String replace = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverse = (new StringBuilder(replace).reverse().toString());

        if(replace.equals(reverse)){
            return true;
        }
        
        return false;
    }
}