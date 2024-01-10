import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans ="";
        for(int i=0;i<n;i++){
            String temp = sc.next();
            ans+=temp;
        }
        System.out.println(ans);
    }
}