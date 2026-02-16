import java.util.Scanner;
//given an integer of size N, in one second you can increase any element by 1. find the minimum time in seconds  to make all elements equal.
public class min_time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int time=0;

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
            time += (maxElemnt - arr[i]);
        }
       System.out.print("\n minimum time in seconds to make all elements equal is :"+time);
    }
}
//to minimize the time make all the element equal to the max element in the array.
// find the max element in the array.
// for every element calculate how much it needs to be increased to reach the maximum 
// sum all those differnces to get the total time needed.