public class PrimeNo {
    public static void main(String[] args) {
        boolean result = isPrime(11);
        System.out.println(result);
    }

    static boolean isPrime(int n){
//this is the typical way of finding if N is prime or not ; but if the N is like 100 then the loop runs like around 98 some times : whichh O(n) complexity;
        if(n<=1){
            return false;
        }
          else {
//            for (int i = 2; i < n; i++) {
//
//                if(n%i==0){
//                    return false;
//                }
//
//            }

            //we using only tille sqrt of n because after the sqrt if n = 36 and sqrt = 6 all number will be repetative no use of checking
            // now time complexity has been reduced to O(RootN);
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0){
                    return false;
                }
            }
         }
          return true;



    }
}
