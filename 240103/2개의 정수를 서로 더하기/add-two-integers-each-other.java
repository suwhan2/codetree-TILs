import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 성해주세요.
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=b+a;
        System.out.println(a+" "+b);
    }
}