import java.util.Scanner;

public class Under14 {
    public static void main(String[] args) {
        Under14();
    }
    static void Under14(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age <=14){
            System.out.print("Injury Status : ");
            boolean isInjured = sc.nextBoolean();

            if(isInjured){

                System.out.println("you are in the team But not on the main 11");
            }
            else{
                System.out.println("You are in the main 11");
            }

        }
        else {
            System.out.println("Not eligible");
        }

    }
}
