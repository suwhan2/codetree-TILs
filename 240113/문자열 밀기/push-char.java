import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        System.out.println(str.substring(1)+str.charAt(0));
    }
}