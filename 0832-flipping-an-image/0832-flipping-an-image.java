class Solution {

    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i = 0 ; i <image.length ; i++){
            int start = 0;
            int end = image[i].length-1;
            int temp = 0;
            while(start<=end){
                temp = image[i][start]^1;
                image[i][start] = image[i][end]^1;
                image[i][end] = temp;
                start++;
                end -- ;
            }
        }
        return image;
    }
}