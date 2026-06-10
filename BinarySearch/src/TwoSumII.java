import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
        int target = 18;
        int [] result = twoSum(numbers,target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        for ( start = 0; start < arr.length; start++) {
            int partner = target - arr[start];
            int nstart = start + 1;
            int nend = arr.length - 1;
            while (nstart <= nend) {
                int nmid = (nstart + nend) / 2;
                if (arr[nmid] == partner) {
                    return new int[]{start + 1, nmid + 1};
                } else if (arr[nmid] < partner) {
                    nstart = nmid + 1;
                } else {
                    nend = nmid - 1;
                }
            }

              }
                 return  new int[]{-1,-1};
            }
        }




