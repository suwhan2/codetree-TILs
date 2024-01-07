import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        final int MIN_NUM = Integer.MIN_VALUE;
        int ans =MIN_NUM;
        
        for(int i=0;i<10;i++){
            if (arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}