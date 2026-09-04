public class skipAppifitsnotApple {

    public static void main(String[] args) {

        System.out.println(skip("bccappes"));


    }

    static String skip(String str){

        if(str.equals("")){
            return str;
        }


        if(str.startsWith("app")&&!str.startsWith("apple")){

            return skip(str.substring(3));
        }

        return str.charAt(0)+skip(str.substring(1));
    }
}
