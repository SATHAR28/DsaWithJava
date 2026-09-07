import java.util.ArrayList;

public class subsetOfstring {
    public static void main(String[] args) {

        String up = "abc";
        String p = "";

        subsetOfstring o = new subsetOfstring();
        System.out.println(o.subSet(up,p));

    }

//    void subset(String up , String p){
//
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//
//        subset(up.substring(1),p+ch);
//        subset(up.substring(1),p);
//    }
    //Adding in array List By creating list inside Body of the function
    static ArrayList<String> subSet(String up , String p){

        if(up.isEmpty()){

            ArrayList<String> list = new ArrayList<>();

            list.add(p);

            return list;
        }


        char ch = up.charAt(0);

        ArrayList<String> left =  subSet(up.substring(1),p+ch);
        ArrayList<String> right =  subSet(up.substring(1),p);

        left.addAll(right);

        return left;


    }
}
