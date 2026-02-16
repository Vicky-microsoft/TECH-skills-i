import java.util.Scanner;
public class sum_pair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("\n enter the elements of the array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

    System.out.print("\n enter the target value:");
    int target=sc.nextInt();
    boolean found=false;
    for (int i=0;i<n;i++){
        for (int j=0;j<n;j++){
            if(arr[i]+arr[j]==target&&i!=j){
                found=true;
                break;
            }
        }
        if(found){
            break;
        }
    }
    if(found){
        System.out.println("Pair with the given sum exists in the array.");
    }else{
        System.out.println("Pair with the given sum does not exist in the array.");
    }
    
}