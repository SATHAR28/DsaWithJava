public class PalindromeUsinginBuiltMethod {
    public static void main(String[] args) {
//        StringBuilder name = new StringBuilder();
//        name.append("sathish");
//        StringBuilder reverse = new StringBuilder();
//        reverse = name.reverse();
//        System.out.println(reverse);

        String name = "amma";

       String reverse = new StringBuilder(name).reverse().toString();
       if(name.equals(reverse)){
           System.out.print("Palindrome");
       }
       else{
           System.out.println("noPalindrome");
       }
    }
}
