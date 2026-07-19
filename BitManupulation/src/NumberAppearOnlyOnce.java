public class NumberAppearOnlyOnce {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 2, 3, 4, 5};
        System.out.println(numberAppearOnlyOnce(arr));
    }

    static int numberAppearOnlyOnce(int[] arr) {

//        int count = 0 ;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//
//                if(arr[i] == arr[j]){
//                    continue;
//                }
//                else{
//
//                }
//
//            }
//        }
//
//        return ElementOnce;
//
//    }
        int unique = 0;
        int i = 0;
        while (i < arr.length) {

            unique = unique^arr[i];
            i++;
        }
        return unique;
    }
}
