import java.util.ArrayList;

public class FactorsOfN {
    public static void main(String[] args) {
        factors3(20);
    }

    //this is like o(n) complexity and brute force ;
//    static void factors1(int n ){
////
////        for (int i = 1; i <=n ; i++) {
////
////            if(n%i==0){
////                System.out.print(i+" ");
////            }
////
////        }
//    }
    //This is okay but its prnting the orders in unsorted way like n =36 =>[1 36 2 18 3 12 4 9 6]
//    static void factors2(int n) {
//
//        for (int i = 1; i * i <= n; i++) {
//
//
//            if (n % i == 0) {
//                if(n/i == i){     // this is edge case for n like 36 because i =6  and n/i = also 6;
//                    System.out.print(i);
//                }
//                else {
//                    System.out.print(i + " " + n / i + " ");
//                }
//            }
//
//        }
    //in this version we have added the n/i in seperate list and prited it in reverse order
    static void factors3(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;

        for (int i = 1; i * i <= n; i++) {


            if (n % i == 0) {
                if(n/i == i){     // this is edge case for n like 36 because i =6  and n/i = also 6;
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }


            }

        }

        for (int j = list.size()-1; j >=0; j--) {

            System.out.print(list.get(j)+" ");

        }

    }
}
