import java.util.ArrayList;

public class PrintAllPath {
    public static void main(String[] args) {

        System.out.println(printList("",3,3));
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

    //Printing in ArrayList

    static ArrayList<String> printList(String p , int r , int c){

        if(r==1&&c==1){

            ArrayList<String> list = new ArrayList<>();

            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll(printList(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(printList(p+'R',r,c-1));
        }

        return list;


    }

}
