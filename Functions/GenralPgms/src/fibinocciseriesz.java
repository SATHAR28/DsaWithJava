public class fibinocciseriesz {
    public static void main(String[] args) {

        fibinocci(10);

    }
    static void fibinocci(int n){
        int first = 0;
        int second = 1;
        System.out.print(first+" "+second+" ");

        int temp =0;
        for (int i = 1; i <= n; i++) {


            int next = first + second;

            System.out.print(next+" ");
            temp = first;
            first = second;
            second = next;

        }
    }
}
