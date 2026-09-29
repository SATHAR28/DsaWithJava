public class CountPath {
    public static void main(String[] args) {

        System.out.println(count(3,3));
    }

    static int count(int r , int c){

        //All the Explanation on the Note or refer kunal's backtracking video

        if(r==1||c==1){
            return 1;
        }



        int down = count(r-1,c);
        int right = count(r,c-1);

        return down + right;
    }
}

