import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i =0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        int sum2=0;
        int sum3=0;
        for(int i=1;i<10;i+=2){
            sum2+=arr[i];
        }
        for(int i=2;i<10;i+=3){
            sum3+=arr[i];
        }
        System.out.printf("%d %.1f",sum2,(sum3/3.0));
    }
}