import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[100];
        int t=0;
        while(true){
            int tmp = sc.nextInt();
            if(tmp==0){
                break;
            }
            arr[t]=tmp;
            t+=1;
        }
        int ans=0;
        for(int i=t;i>=t-3;i--){
            ans+=arr[i];
        }
        System.out.println(ans);
    }
}