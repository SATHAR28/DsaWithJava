public class reverseNO {
    public static void main(String[] args) {
        int  sum = 0;
        int n = 8432;
        System.out.println(reverse(n,sum));
    }

    static int reverse (int n ,int sum){

        if(n == 0){
            return sum;

        }

        int rem = n%10;
         sum = sum*10+rem ;
        return reverse(n/10,sum);
    }
}
