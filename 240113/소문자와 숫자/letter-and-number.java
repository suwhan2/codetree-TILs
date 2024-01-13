import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strInput = sc.next();

        int n = strInput.length();
        char arr[] = new char[n];
        arr = strInput.toCharArray();

        int gap = 'a' - 'A';
        for (int i = 0; i < n; i++) {
            if ('A' <= arr[i] && arr[i] <= 'Z') {
                System.out.print(arr[i]+=gap);
            }
            else if ('a' <= arr[i] && arr[i] <= 'z') {
                System.out.print(arr[i]);
            }
            else if ('0' <= arr[i] && arr[i] <= '9') {
                System.out.print(arr[i]);
            }
        }

    }
}