/*given an array ,count number of elements having at least one element greater than itself.*/
import java.util.Scanner;
public class file1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count=0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxElemnt=arr[0];
        for (int i=0;i<n;i++){
        
            if(arr[i]>maxElemnt){
                maxElemnt=arr[i];
            }
        

        }
        System.out.print("/n max element is :"+maxElemnt);
        for (int i=0;i<n;i++){
            if(arr[i]!=maxElemnt){
                count++;
            }
        }
       System.out.print("\n count of numbers is :"+count);
    }
}

/*for every max element there won't be any element greater than itself...... */




/*-----pseudo code------ 

   1. iterate and find the max element
   2. iterate and get the number of element that are not equal to max.
   3. increment the counter.*/