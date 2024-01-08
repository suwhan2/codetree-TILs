import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9

        2 3 4
        5 6 7
        8 9 10

         */
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        //기능부
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]*arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}