public class skipA {
    // just skip if the letter is "a" and in new string is without any "a"
    //eg str = bccada => bccd

    public static void main(String[] args) {

        String str = "bcaaxab";

        String neww = " ";

        int i = 0;

        System.out.println(deleteA(str,neww,i));

    }

    static String deleteA(String str , String neww , int i){

        if(i==str.length()){
            return neww;
        }


        if(str.charAt(i)!='a'){

            neww = neww+str.charAt(i);

        }
        return deleteA(str,neww,i+1);

    }




}
