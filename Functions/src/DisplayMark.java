import java.util.Scanner;

public class DisplayMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        for (int i = 0 ; i<4 ; i++) {
            System.out.print("Enter Marks :");
            int marks = sc.nextInt();
            String result = getMarks(marks);
            System.out.println(result);
        }
    }
    static String getMarks(int marks){
        if(marks >=91 && marks <=100){
            return "AA";
        }
        else if(marks >=81 && marks <=90){
            return "AB";
        }
        else if (marks >= 71 && marks <=80){
            return "BB";
        }
        else{
            return "Fail";
        }
    }
}
