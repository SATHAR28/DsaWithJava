public class CountNoOfTimesLoopRunsForNthMagicNo {

    public static void main(String[] args) {

        // This is very known way But there is a formula For this (basically how many digits are there when its convertedto binary  ;
         int n = 5;
//        int count = 0;
//        while(n>0){
//
//            if(n!=0){
//                count++;
//            }
//            n = n>>1;
//
//        }
//        System.out.println(count);

        //Formula Approach



        int ans = 0;
        int b = 2; // base which is 2 because we consider binary

        ans =  (int) (Math.log(n)/Math.log(b)) + 1; // Formula for this

        System.out.println(ans);

        // So the loop runs fro O(log n ) times;

    }
}
