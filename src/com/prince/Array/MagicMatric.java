import java.util.*;

public class MagicMatric {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
   
        for(int i=0; i<n;i++ ){
           for(int j=0; j<m;j++){
               arr[i][j] = sc.nextInt();
           }
   
        }
        int sum3=0,sum4=0;
   
   
        for(int i=0; i<n;i++ ){
           int sum1=0,sum2=0;
           for(int j=0; j<m;j++){
               sum1 += arr[i][j];
               sum2 += arr[j][i];
               if(i==j) sum3 += arr[i][j];
   
               if(i+j == arr.length-1) sum4 += arr[i][j];
               
           }
   
   
        }
   
       System.out.println(sum1);
       System.out.println(sum2);
       System.out.println(sum3);
       System.out.println(sum4);
    }

     
    
}
