public class MazeWithObstacles {

    public static void main(String[] args) {

        boolean [][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        MazeWithObstacles("",board,0,0);

    }

    static void MazeWithObstacles(String p , boolean[][]maze , int r , int c){

        // for c => we can use maze[0] or maze[1] or maze[2] because here we know that every row has 3 cols and there are 3 rows
        if(r==maze.length-1&&c==maze[1].length-1){

            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            MazeWithObstacles(p+'D',maze,r+1,c);
        }
        if(c<maze[1].length-1){
            MazeWithObstacles(p+'R',maze,r,c+1);
        }



    }


}
