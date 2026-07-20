public class noOfSetBits {
    public static void main(String[] args) {
        System.out.println(setBits(8));

    }
    static int setBits(int n ){
        int count = 0;
        int last  = 0;
        while(n>0){

            last =  n&1;

            if(last == 1){
                count++;
            }
            n = n>>1;
        }

        return count;
    }
}
