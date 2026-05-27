public class StringSearch {
    public static void main(String[] args) {
        String name = "sathish";
        System.out.println(search(name , 'i'));


    }
    static boolean search(String name , char target){
        for( int  i = 0 ; i <name.length();i++){
            if(name.charAt(i) == target){
                return true;
            }

        }
        return false;
    }

}
