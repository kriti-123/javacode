import java.io.*;
import java.util.*;

public class palindonerows {
     public static int check(int[] a,int l,int r){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
          while(l<r){
                 if(a[l]!=a[r]){
                     return 0;
                 }
                l++;r--;
             }
         return 1;
     }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
         int[][] mat=new int[rows][cols];
         for(int r=0;r<rows;r++){
             for(int c=0;c<cols;c++){
                 mat[r][c]=sc.nextInt();
             }
         }
         int count=0,ans=0;
         for(int r=0;r<rows;r++){
            
             int[] a=mat[r];
             int left=a[0];
             int right=a[cols-1];
             System.out.print(right+".....");
              ans = check(a,left,right);
             count=count+ans;
         }
         System.out.println(count);
      
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}