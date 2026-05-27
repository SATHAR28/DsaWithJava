import java.util.Scanner;

public class Febinocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp = 0;
        int count = 2;
        while(count <= n ){
            temp = b;
            b = a+b;
            a = temp;
            count++;

        }
        System.out.println(b);
    }

}
