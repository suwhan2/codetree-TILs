import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String arr= sc.next();
        int n = sc.nextInt();

        for(int i=arr.length()-1;i>=arr.length()-n;i--){
            System.out.print(arr.charAt(i));
        }

    }
}