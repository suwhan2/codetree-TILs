import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String AB = A+B;
        String BA = B+A;
        
        System.out.println(Integer.parseInt(AB)+Integer.parseInt(BA));
    }
}