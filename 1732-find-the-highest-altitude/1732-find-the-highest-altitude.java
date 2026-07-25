class Solution {
    public int largestAltitude(int[] gain) {

       int starting = 0;
       int  next = gain[0];
       int max = 0 + next > starting ? next : starting;

        for (int i = 1 ; i<gain.length; i++){
            
             next = next + gain[i];
           
           if( next > max){
            max = next;
           } 

        }
        return max;
    }
}