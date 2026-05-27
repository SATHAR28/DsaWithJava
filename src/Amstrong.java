import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int org = n;
        int sum =0 ;
        while (n> 0){
            int digit = n%10;
            sum = sum + digit*digit*digit;
            n=n/10;

        }
        if ( sum == org ){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("No Armstrong");
        }

        System.out.println(sum);


    }
}
