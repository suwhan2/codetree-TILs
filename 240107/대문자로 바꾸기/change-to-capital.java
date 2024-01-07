import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][3];

        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.next().charAt(0);

                arr[i][j] +='A'-'a';
                System.out.print((char)arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}