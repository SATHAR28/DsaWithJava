import java.util.ArrayList;

public class LinearSearchWithDuplicate2 {
    public static void main(String[] args) {
        int [] arr = {4,0,4,7,2};
        int target = 4;
        int i = 0;
        System.out.println(search(arr,target,i));
    }
    static ArrayList<Integer> search(int [] arr , int target , int i){
        ArrayList <Integer> list =  new ArrayList<>();
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> ansFromBelow = search(arr, target, i+1);
        list.addAll(ansFromBelow);
        return list;
    }

}
