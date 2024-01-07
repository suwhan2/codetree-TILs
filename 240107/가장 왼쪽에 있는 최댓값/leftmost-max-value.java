import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        final int INT_MIN = Integer.MIN_VALUE;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //기능부
        int recentMaxIndex = n;
        while (true) {
            int maxNum = INT_MIN;
            int maxIndex=0;
            for (int i = 0; i < recentMaxIndex; i++) {
                if (arr[i] > maxNum) {
                    maxNum = arr[i];
                    maxIndex=i;
                }
            }
            recentMaxIndex = maxIndex;
            System.out.print((recentMaxIndex + 1) + " ");

            if (recentMaxIndex == 0) {
                break;
            }
        }

    }
}