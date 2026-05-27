public class MinMax {
    public static void main(String[] args) {
        int less = min(2,6,1);
        int more = max(4,7,1);
        System.out.println(less);
        System.out.println(more);

    }
    static int min(int a , int b , int c){
        int min = a;
        if(b <min && b <min){
            min = b;
        }
        else{
            min = c;
        }
        return min;
    }
    static int max(int a , int b , int c){
        int max = a;
        if(b >max && b >max){
            max = b;
        }
        else{
            max = c;
        }

        return max;
    }

}
