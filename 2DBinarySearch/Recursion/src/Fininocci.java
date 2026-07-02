public class Fininocci {
    public static void main(String[] args) {

        int ans = fibo(5);
        System.out.println(ans);

    }

    static int fibo(int n){

        //The Base Condition - things that we are already aware of;
        if(n<2){ // which is for 0th and 1st fibinocci no 0 and 1 are the answer respectivley;
            return n;
        }

        return fibo(n-1) + fibo(n-2);


    }
}
