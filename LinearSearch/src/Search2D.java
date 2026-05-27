import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int [] [] arr = {
                {3,1,6},
                {86,21,34,1},
                {4}
        };
        int target = 21;
        int [] result = search(arr , target);
        System.out.println(Arrays.toString(result));
    }
    static  int[] search (int[] [] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }



            }


        }
        return new int[] {-1 , -1};
    }
}
