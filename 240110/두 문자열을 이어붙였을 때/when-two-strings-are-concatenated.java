import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        if((A+B).equals(B+A)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}