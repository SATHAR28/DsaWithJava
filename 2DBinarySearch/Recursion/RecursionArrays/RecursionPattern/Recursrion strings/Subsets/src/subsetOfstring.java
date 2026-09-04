public class subsetOfstring {
    public static void main(String[] args) {

        String up = "abc";
        String p = "";

        subsetOfstring o = new subsetOfstring();
        o.subset(up,p);

    }

    void subset(String up , String p){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subset(up.substring(1),p+ch);
        subset(up.substring(1),p);




    }
}
