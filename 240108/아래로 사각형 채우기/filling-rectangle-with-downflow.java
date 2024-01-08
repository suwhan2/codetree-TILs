import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=1;
        int arr[][] = new int[n][n];

        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                arr[i][j]=num;
                num++;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}