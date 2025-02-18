import java.util.Scanner;

public class MultiMatix {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the row and colum");
        int r1=sc.nextInt(), c1=sc.nextInt();
        int[][] arr1 = new int[r1][c1];

        System.out.println("Enter the row and colum");

        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];

        int[][] arr3 = new int[r1][c2];

        System.out.println("arr1");
        for(int i=0; i<r1;i++ ){
            for(int j=0; j<c1;j++){
                arr1[i][j] = sc.nextInt();
            }

        }
        System.out.println("Arr2");
        for(int i=0; i<r2;i++ ){
            for(int j=0; j<c2;j++){
                arr2[i][j] = sc.nextInt();
            }

        }

        if(c2 == r1){

            for(int i=0;i < r1;i++){
                for (int j = 0;j< c2;j++) {
                    int sum = 0;
                    for(int k =0; k<c2;k++){
                        sum += arr1[i][k] * arr2[k][j];
                    }
                    arr3[i][j] = sum;
                    
                }
            }

        }else{
            System.out.println("No matrric will excute");
        }

        for(int i=0; i<r1;i++ ){
            for(int j=0; j<c2;j++){
                System.out.print(arr3[i][j]+ " ");
            }
            System.out.println();

        }

    }
            
}
