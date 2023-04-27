 import java.io.*;
import java.util.*;

public class convertiDto2Dmatrix {

     public static void matrixrow(int[] a,int n,int r,int c){
        int [][] mat=new int[r][c];
         for(int idx=0;idx<n;idx++){
             int row=idx/c;
             int col=idx%c;
             mat[row][col]=a[idx];
         }
         for(int i=0;i<r;i++){
             for(int j=0;j<c;j++){
                 System.out.print(mat[i][j]+" ");
             }
             System.out.println();
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        matrixrow(a,n,r,c);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

