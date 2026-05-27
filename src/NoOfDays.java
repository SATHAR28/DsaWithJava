import java.sql.SQLOutput;
import java.util.Scanner;

public class NoOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month : ");
        int month = sc.nextInt();
        int No_of_days = 0;
        int count = 0 ;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> No_of_days = 31;
            case 2, 4, 6, 9, 11 -> No_of_days = 30;
        }
        for (int i = 1; i <= No_of_days; i++) {
            if(i%2==0){
                count++;
            }


        }
        System.out.println("Kunal can go out with his friend on "+ count  + "  Days");
    }
}
