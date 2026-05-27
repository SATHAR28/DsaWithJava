//This is O(n) Solution (brute Force Solution);
public class Sqrt {
   /* public static void main(String[] args) {
        int ans = sqrt(16);
        System.out.println(ans);
    }

    static int sqrt(int num){
        int i ;

        for(i = 1 ; i*i<=num ; i++){

        }

        return i-1;
    }
}/*
//This method using Binary search

    */

    public static void main(String[] args) {
        int ans = SqrtBinary(15);
        System.out.println(ans);
    }
    static int SqrtBinary(int num){
        int start = 0;
        int end = num;
        int  ans = 0;
        while(start<=end){

            int mid = start+(end-start)/2;

            if (num == mid*mid ){
                return mid;
            }
            else if ( num < mid*mid){

                end = mid -1 ;
            }
            else{
                ans = mid;
                start = mid +1;
            }
        }

        return ans;
    }
}




