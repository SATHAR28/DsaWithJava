public class XORfromA_till_B {
    public static void main(String[] args) {
        System.out.println(XOR(3)^XOR(10));
    }
    static int XOR(int n ){

        if(n%4 == 0){
            return n;

        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
        if(n%4==3){
            return 0;
        }
        return -1;
    }
}
