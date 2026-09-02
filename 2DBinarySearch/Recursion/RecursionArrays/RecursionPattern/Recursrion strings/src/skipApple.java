public class skipApple {

    public static void main(String[] args) {
        String str = "bcapplexuv";
        String neww = " ";

        System.out.println(deleteApple(str));

    }

    static String deleteApple(String str ){

        if(str.isEmpty()){
            return str;
        }
        if(str.startsWith("apple")){
            return str.substring(5);
        }
        else{
            return str.charAt(0)+deleteApple(str.substring(1));
        }
    }
}
