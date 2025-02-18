import java.util.Scanner;

public class AddMatrix {

public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[][] arr1 = new int[n][m];
    int[][] arr2 = new int[n][m];
    int[][] arr3 = new int[n][m];

    System.out.println("arr1");
    for(int i=0; i<arr1.length;i++ ){
       for(int j=0; j<arr1.length;j++){
           arr1[i][j] = sc.nextInt();
       }

    }
    System.out.println("Arr2");
    for(int i=0; i<arr2.length;i++ ){
       for(int j=0; j<arr2.length;j++){
           arr2[i][j] = sc.nextInt();
       }

    }
    System.out.println("arr3");

    for(int i=0; i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
            arr3[i][j] = arr1[i][j] + arr2[i][j];
            System.out.println(arr3[i][j]);
        }
    }
    

    // for(int i=0; i<arr3.length;i++ ){
    //     for(int j=0; j<arr3.length;j++){
    //         System.out.println(arr3[i][j]);
    //     }
 
    //  }



}



     
    
}
