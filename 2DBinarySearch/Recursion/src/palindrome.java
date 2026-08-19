public class palindrome {

    public static void main(String[] args) {
        int n = 121;
        int sum = 0;
        System.out.println(isPalindrome(n,sum));
    }

    static int reverse(int n ,int sum){

        if(n == 0){
            return sum;

        }

        int rem = n%10;
        sum = sum*10+rem ;
        return reverse(n/10,sum);
    }
    static boolean isPalindrome(int n , int sum){

        return n == reverse(n,sum);

    }


}


