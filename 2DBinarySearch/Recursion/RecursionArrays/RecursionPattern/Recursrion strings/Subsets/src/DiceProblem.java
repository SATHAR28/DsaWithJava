public class DiceProblem {
    public static void main(String[] args) {
        int target =  4;

        dice("",target);

    }

    //Refer the Recursion tree that i drew in my note >> Its very easy to interpret from the tree;

    static void dice(String p , int target){

        if(target == 0){
            System.out.println(p);
            return;
        }


        for (int i = 1; i <= target; i++) {

            dice(p+i,target-i);

        }

    }
}
