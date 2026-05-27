public class RichestCoustomer {
    public static void main(String[] args) {
        int [] [] acc = {
                {2,2,3,4},
                {7,1,9},
                {7}
        };
        int result = maxWealth(acc);
        System.out.println(result);
    }
    static int maxWealth(int [] [] acc ){
        int max = 0;
        for (int i = 0; i < acc.length; i++) {
            int wealth = 0;
            for (int j = 0; j < acc[i].length; j++) {
                wealth += acc[i][j];
                if(wealth > max){
                    max = wealth;
                }


            }

        }
        return max;
    }
}
