public class FindIfNoIsPowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }

    static boolean isPowerOfTwo(int n){
//        int last =0;
//        int count = 0;
//
//        while(n>0) {
//
//            last = n & 1;
//
//            if(last==1){
//                count++;
//            }
//            n = n>>1;
//        }
//        if(count == 1){
//            return true;
//        }
//
//        return false;
        return ( n&(n-1) ) == 0; // this explanation is on the note
    }
}
