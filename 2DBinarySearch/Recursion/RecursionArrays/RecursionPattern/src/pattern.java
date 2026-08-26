public class pattern {

    public static void main(String[] args) {
        Invertedtriangle(4,0);
        NormalTriangle(1,0);
    }
    static void Invertedtriangle(int r , int c){
        if(r == 0){
            return;
        }
        if(c<r){
            System.out.print("*"+" ");
            Invertedtriangle(r,c+1);
        }
        else{
            System.out.println();
            Invertedtriangle(r-1,0);
        }
    }
    static void NormalTriangle(int r,int c){
        if(r > 4 ){
            return;
        }

        if(c<r){
            System.out.print("*"+" ");
            NormalTriangle(r,c+1);
        }
        else{
            System.out.println();
            NormalTriangle(r+1,0);
        }
    }
}
