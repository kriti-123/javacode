// import java.io.*;
import java.util.*;
// import java.io.*;

public class traverserows {
     public static void swap(int[][] mat,int idx,int lc,int rc){
        int temp=mat[idx][lc];
        mat[idx][lc]=mat[idx][rc];
        mat[idx][rc]=temp;
        }
      public static void reverse(int[][] mat,int n){
        for(int i=0;i<n;i++){
            int lc=0,rc=n-1;
            while(lc<rc){
                swap(mat,i,lc,rc);
                lc++;rc--;
            }
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int [][] mat=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        reverse(mat,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+"jjiji");
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}