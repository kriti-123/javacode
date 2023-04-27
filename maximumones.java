import java.io.*;
import java.util.*;

public class maximumones {
    public static int rowAndMaximumOnes(int[][] mat) {
     int n=mat.length;
        int m=mat[0].length;
        int index=0,max=0;
        for(int r=0;r<n;r++){
            int count=0;
            for(int c=0;c<m;c++){
                if(mat[r][c]==1) count++;
                if(count>max){
                    max=count;
                    index=r;
                }
            }
        }
        
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] mat=new int[r][c];
        for(int row=0;row<r;row++){
            for(int col=0;col<c;col++){
                mat[row][col]=sc.nextInt();
            }
        }
       int idx=rowAndMaximumOnes(mat);
        for(int i=0;i<c;i++){
            System.out.print(mat[idx][i]+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
