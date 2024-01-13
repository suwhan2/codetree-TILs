import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char charInput = sc.next().charAt(0);
        int intInput = sc.nextInt();

        System.out.print((int)charInput+" "+(char)intInput);
    }
}