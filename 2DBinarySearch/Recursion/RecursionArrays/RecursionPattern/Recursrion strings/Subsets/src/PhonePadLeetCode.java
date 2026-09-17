import java.util.ArrayList;

public class PhonePadLeetCode {
    public static void main(String[] args) {


        ArrayList<String> list =  new ArrayList<>();

        System.out.println(pad("","22" , list));

    }

    static ArrayList<String> pad(String p , String up , ArrayList<String> list){

        if(up.isEmpty()){
            list.add(p);
            return list;
        }



        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3 ; i++) {

            char ch = (char) ('a' + i);

            pad(p+ch,up.substring(1),list);

        }


        return list;

    }
}
