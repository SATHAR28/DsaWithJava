public class patterns {
    public static void main(String[] args) {

        pattern13(5);
    }
//    static void pattern6( int n){
//        for (int row = 1; row <=n ; row++) {
//            int NoOfSpaces = n-row;
//            for (int s = 0; s < NoOfSpaces; s++) {
//                System.out.print(" ");
//            }
//            for (int col = 0; col < row; col++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
//    static void pattern8( int n){
//        for (int row = 1; row <=n ; row++) {
//            int NoOfSpaces = n-row;
//            for (int s = 0; s < NoOfSpaces; s++) {
//                System.out.print(" ");
//            }
//            for (int col = 0; col < 2*row-1; col++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
//    static void pattern12(int n ){
//        for (int row = 1; row<=2*n ; row++) {
//
//            int totalSpaces = row<=n?row-1:2*n-row;
//            for (int s = 1; s <= totalSpaces; s++) {
//                System.out.print(" ");
//            }
//            int totalCol = row<=n?n-row+1:row-n;
//            for (int col = 1; col <=totalCol ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//    }
//static void pattern17(int n){
//    for (int row = 1; row <=2*n-1 ; row++) {
//
//        int totalSpace = row<=n?n-row:row-n;
//        for (int s = 1; s <=totalSpace ; s++) {
//            System.out.print(" ");
//        }
//
//        if(row<=n){
//
//        for (int col = row; col >=1 ; col--) {
//            System.out.print(col);
//        }
//        for (int col = 2; col <=row ; col++) {
//            System.out.print(col);
//        }
//
//
//    }
//        else {
//            for (int col = 2*n-row; col >=1 ; col--) {
//                System.out.print(col);
//            }
//            for (int col = 2; col <=2*n-row ; col++) {
//                System.out.print(col);
//            }
//        }
//        System.out.println();
//
//        }
//}
//    static void pattern31(int n){
//        int orginalN = n;
//
//        int N = 2*n-2;
//
//
//        for (int row = 0; row <=N; row++) {
//
//            for (int col = 0; col <= N; col++) {
//                int atThisIndex = orginalN-Math.min(Math.min(row,col),Math.min(N-row,N-col));
//                System.out.print(atThisIndex+" ");
//            }
//            System.out.println();
//
//        }
//
//    }

    static void pattern13(int n) {

        for (int row = 1; row <= n; row++) {

            if (row == n) {

                // Bottom row
                for (int col = 0; col < 2 * n - 1; col++) {
                    System.out.print("*");
                }

            } else {

                // Leading spaces
                for (int s = 1; s <= n - row; s++) {
                    System.out.print(" ");
                }

                // First star
                System.out.print("*");

                // Middle rows
                if (row > 1) {

                    // Inner spaces
                    for (int s = 0; s < 2 * row - 3; s++) {
                        System.out.print(" ");
                    }

                    // Second star
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
