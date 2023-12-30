import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String cInput = sc.next();
        char c = cInput.charAt(0);
        double a =sc.nextDouble();
        double b =sc.nextDouble();
        System.out.println(c);
        System.out.printf("%.2f\n",a);
        System.out.printf("%.2f\n",b);
    }
}