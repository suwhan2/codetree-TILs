import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String newA = "";
        String newB = "";
        int an = A.length();
        int bn = B.length();
        for (int i = 0; i < an; i++) {
            if ('0' <= A.charAt(i) && A.charAt(i) <= '9') {
                newA += A.charAt(i);
            }
        }
        for (int i = 0; i < bn; i++) {
            if ('0' <= B.charAt(i) && B.charAt(i) <= '9') {
                newB += B.charAt(i);
            }
        }

        System.out.println(Integer.parseInt(newA) + Integer.parseInt(newB));
    }
}