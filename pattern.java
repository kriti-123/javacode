import java.util.*;

public class pattern {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

         
         for(int i=0;i<n;i++){
             if(i==n/2){
                for(int j=0;j<n;j++) System.out.print("* ");
             }
             else{
                System.out.print("* ");
             }
             System.out.println();
         }
    }
}
