public class Palindrome {
    public static void main(String[] args) {
       String result = palindrome("amma");
        System.out.println(result);
    }
    static String palindrome(String name){
         int start = 0;
         int end = name.length() -1;
         while(start<end){
             if(name.charAt(start) == name.charAt(end)){
                 start++;
                 end--;
             }
             else{
                 return "noPalindrome";
             }
         }
         return "palindrome";
    }
}
