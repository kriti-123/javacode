import java.io.*;
import java.util.*;

public class spiralmatrix {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        
        int[][] mat = new int[rows][cols];
        
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                mat[r][c] = scn.nextInt();
            }
        }
        
        int fr = 0, lr = rows - 1, fc = 0, lc = cols - 1;
        int count = 0;
        
        while(count < rows * cols){
            // top wall: left to right
            for(int c = fc; c <= lc; c++){
                System.out.print(mat[fr][c] + "   ");
                count++;
            }
            fr++;
            
            if(count == rows * cols) return;

            // right wall: top to bottom
            for(int r = fr; r <= lr; r++){
                System.out.print(mat[r][lc] + "   ");
                count++;
            }
            lc--;
            
            if(count == rows * cols) return;

            // bottom wall: right to left
            for(int c = lc; c >= fc; c--){
                System.out.print(mat[lr][c] + "   ");
                count++;
            }
            lr--;
            
            if(count == rows * cols) return;

            // left wall: bottom to top
            for(int r = lr; r >= fr; r--){
                System.out.print(mat[r][fc] + "   ");
                count++;
            }
            fc++;
        }
    }
}