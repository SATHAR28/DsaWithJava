public class SieveAlgoForPrimeNO {
    public static void main(String[] args) {
        int n = 30;
        //by default in java boolean array is false at the start;
        boolean [] Prime = new boolean[n+1]; // because we need to store 0 to 30;

       SieveOfEratosthenes(n,Prime);
    }
    static void SieveOfEratosthenes(int n , boolean [] Prime){

        for (int i = 2; i <=Math.sqrt(n) ; i++) {

            if(Prime[i] == false){

                for (int j = i*2; j <= n; j=j+i) {

                    Prime[j] = true; // true means not prime;
                }
            }
        }

        for (int i = 2; i <=n; i++) {

            if(Prime[i] == false){

                System.out.print(i +" ");
            }
        }
    }
}
