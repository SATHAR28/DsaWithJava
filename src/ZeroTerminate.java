import java.util.Scanner;
public class ZeroTerminate {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum_of_negative_no = 0;
        int sum_of_positive_even_no = 0;
        int sum_of_positive_odd_no = 0;

        while(true){
            int N = sc.nextInt();
            if (N==0){
                break;
            }
            else if(N<0) {
                sum_of_negative_no = sum_of_negative_no + N;
            }
            else if(N>0){
                if(N%2==0){
                    sum_of_positive_even_no = sum_of_positive_even_no + N;
                }
                else{
                    sum_of_positive_odd_no = sum_of_positive_odd_no + N;
                }
            }
            else{
                System.out.println("Invalid Input");
            }

        }
        System.out.println(sum_of_negative_no);
        System.out.println(sum_of_positive_even_no);
        System.out.println(sum_of_positive_odd_no);
    }
}
