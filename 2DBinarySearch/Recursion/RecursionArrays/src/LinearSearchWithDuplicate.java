import java.util.ArrayList;

public class LinearSearchWithDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] arr = {3,7,4,4,1,9};
        int target  = 4;
        int i = 0;
        System.out.println(search(arr,target,i,list));

    }
    static ArrayList<Integer>search(int[]arr,int target , int i , ArrayList<Integer> list){

        if(i == arr.length){
            return list;
        }

        if(arr[i] == target){
            list.add(i);

        }

        return search(arr,target,i+1 , list);
    }
}
