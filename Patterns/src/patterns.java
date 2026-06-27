public class patterns {
    public static void main(String[] args) {

        pattern8(5);
    }
    static void pattern6( int n){
        for (int row = 1; row <=n ; row++) {
            int NoOfSpaces = n-row;
            for (int s = 0; s < NoOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    static void pattern8( int n){
        for (int row = 1; row <=n ; row++) {
            int NoOfSpaces = n-row;
            for (int s = 0; s < NoOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2*row-1; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
