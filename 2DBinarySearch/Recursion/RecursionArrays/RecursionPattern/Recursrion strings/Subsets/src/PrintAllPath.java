public class PrintAllPath {
    public static void main(String[] args) {

        printAll("",3,3);
    }

    static void printAll(String p , int r , int c){

        if(r==1&&c==1){

            System.out.println(p);
            return;

        }

        if(r>1){
            printAll(p+'D',r-1,c);
        }
        if(c>1){
            printAll(p+'R',r,c-1);
        }


    }
}
