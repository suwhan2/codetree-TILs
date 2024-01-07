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
        int ans1 = INT_MIN;
        int ans1Index=0;
        int ans2 = INT_MIN;
        for (int i = 0; i < n; i++) {
            if(arr[i]>ans1){
                ans1=arr[i];
                ans1Index=i;
            }
        }
        arr[ans1Index]=INT_MIN;
        for(int i=0;i<n;i++){
            if(arr[i]>ans2){
                ans2=arr[i];
            }
        }
        System.out.print(ans1+" "+ans2);
    }
}