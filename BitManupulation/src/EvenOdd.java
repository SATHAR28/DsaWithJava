public class EvenOdd {
    public static void main(String[] args) {

        boolean ans = isEven(30);
        System.out.println(ans);

    }

    static boolean isEven(int n){

        return (n&1) == 0;
    }
}
