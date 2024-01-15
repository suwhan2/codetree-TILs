import java.util.Scanner;

public class Main {
    public static boolean checkThirdNum(int x) {
        if (x % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkNum(int x) {
        String tmp = String.valueOf(x);
        int n = tmp.length();
        for (int i = 0; i < n; i++) {
            if (tmp.charAt(i) == '3' || tmp.charAt(i) == '6' || tmp.charAt(i) == '9') {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (checkNum(i) || checkThirdNum(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}