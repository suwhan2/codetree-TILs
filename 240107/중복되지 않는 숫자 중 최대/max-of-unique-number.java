import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        int ans = -1;
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++) {
            int standard = arr[i];
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[j]==standard){
                    cnt++;
                }
            }
            if(cnt==1){
                if(ans<standard){
                    ans=standard;
                }
            }
        }
        System.out.println(ans);


    }
}