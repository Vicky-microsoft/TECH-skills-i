import java.util.Scanner;
public class sum_diagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the number of rows in the matrix: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.print("\n enter the elements of the matrix: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("\n the matrix is:");
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    
    for (int i=0;i<m;i++){
        for (int j=0;j<n;j++){
            if(i==j){
                sum+=matrix[i][j];
            }
        }
    }
    System.out.println("Sum of diagonal elements: " + sum);
    
}
}
