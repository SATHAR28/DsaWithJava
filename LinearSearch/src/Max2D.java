import java.util.Arrays;

public class Max2D {
    public static void main(String[] args) {
        int [] [] arr = {
                {3,1,6},
                {86,21,34,1},
                {4}
        };
        int [] ans = (search(arr));
        System.out.println(Arrays.toString(ans));

    }
    static  int [] search (int[] [] arr) {
        int max = arr [0] [0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j] ;
                    row = i;
                    col = j;

                }


            }


        }
        return new int [] {row , col};

    }
}

