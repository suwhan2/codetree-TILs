import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int a = 0;
        int b = 0;
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            if(i%2==1){
                a+=arr[i];
            }
            else{
                b+=arr[i];
            }
        }
        int ans = Math.abs(a-b);
        System.out.println(ans);
    }
}