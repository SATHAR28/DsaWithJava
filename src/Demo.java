

public class Demo {
    public static void main(String[] args) {
        int num = 87;
        boolean isPrime = true;
        if(num <=1){
            isPrime = false;
        }
        else{
            for(int i = 2; i*i<=num;i++){

                if(num%2==0){
                    isPrime = false;
                }
            }
        }
        if(isPrime == true){
            System.out.println("Its prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }


    }
}
