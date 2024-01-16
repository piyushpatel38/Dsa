import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no=");
        int n=6;
        int arr[]= new int[n];
        int target=3;
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
    for(int i=0; i<n; i++){
        if(arr[i]==target){
            System.out.println(i);
        }
    }
    }
}
