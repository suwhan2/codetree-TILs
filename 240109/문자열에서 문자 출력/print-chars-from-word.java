import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String arr= sc.nextLine();
        for(int i=0;i<arr.length();i++){
            System.out.println(arr.charAt(i));
        }

    }
}