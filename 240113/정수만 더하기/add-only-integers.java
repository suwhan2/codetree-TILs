import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strInput = sc.next();

        int n = strInput.length();
        char arr[] = new char[n];
        arr = strInput.toCharArray();
        int ans=0;
        for (int i = 0; i < n; i++) {
            if ('0' <= arr[i] && arr[i] <= '9') {
                ans+=arr[i];
            }
        }
        System.out.println(ans);

    }
}