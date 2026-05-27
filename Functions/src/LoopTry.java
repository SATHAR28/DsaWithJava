import java.util.Scanner;

public class LoopTry {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            sum();
        }


    }
    static void sum(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter num 1 :");

        int n1 = sc.nextInt();
        System.out.println("Num 2 :");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println(sum);
    }

}
