import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strInput = sc.next();

        int n = strInput.length();
        int ans=0;
        for (int i = 0; i < n; i++) {
            if ('0' <= strInput.charAt(i) && strInput.charAt(i) <= '9') {
                ans+=(strInput.charAt(i)-'0');
            }
        }
        System.out.println(ans);

    }
}