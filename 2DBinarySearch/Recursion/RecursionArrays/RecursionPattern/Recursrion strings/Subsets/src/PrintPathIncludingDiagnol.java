public class PrintPathIncludingDiagnol {

    public static void main(String[] args) {

        PrintDiagnal("",3,3);
    }

    //along wiht d and r we now also explore di -> diagnal path

    static void PrintDiagnal(String p , int r , int c){

        if(r==1&&c==1){

            System.out.println(p);
            return;

        }
        if(r>1){
            PrintDiagnal(p+'D',r-1,c);
        }
        //while explore diagnol we have to reduce both r and c And if both of them ==1 we cant further move
        //we can oly move diagnolly if the r and c is not 1
        if(r>1&&c>1){
            PrintDiagnal(p+"DI",r-1,c-1);
        }
        if(c>1){
            PrintDiagnal(p+'R',r,c-1);
        }
    }
}
