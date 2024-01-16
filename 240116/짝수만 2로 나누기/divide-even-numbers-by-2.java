import java.util.Scanner;

public class Main {
    public static void divideEvenNumberByTwo(int arr[]){
        int n= arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]=arr[i]/2;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        divideEvenNumberByTwo(arr);

        for(int x: arr){
            System.out.print(x+" ");
        }


    }
}