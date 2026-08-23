public class noOfZeros {
    public static void main(String[] args) {

        int n = 0;
        int count = 0;
        if(n == 0){
            System.out.println("1");
        }
        else {
            System.out.println(Counts0(n, count));
        }

    }
    static int Counts0(int n , int count){
        if(n==0){
            return count;
        }

        int rem = n%10;
        if(rem == 0){

            count++;
        }
        return Counts0(n/10,count);
    }



}
