public class CountSteps {
    public static void main(String[] args) {
        int num = 14;
        int steps = 0;
        System.out.println(numberOfSteps(num,steps));

      return steps;
        }
        if(num%2==0){
            return numberOfSteps(num/2,steps+1);
        }

        return numberOfSteps(num-1,steps+1);
    }
}
