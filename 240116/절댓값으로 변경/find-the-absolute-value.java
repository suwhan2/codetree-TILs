import java.util.Scanner;

public class Main {
    public static void convertingToArrayAbsoluteValue(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                arr[i]=arr[i]*-1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        convertingToArrayAbsoluteValue(arr);

        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}