// wap to find sum  of frame elements in the matrix.
import java.util.Scanner;
public class sum_frame_elements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] matrix=new int[rows][cols];
        System.out.print("\n Enter the elements of the matrix:\n");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Element ["+i+"]["+j+"]:");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("the sum of frame elements is:");
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || i==rows-1 || j==0 || j==cols-1){
                    sum+=matrix[i][j];
                }
            }
        }        System.out.println(sum);
    }
}
