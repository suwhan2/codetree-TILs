import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[10];
        int ans=0;
        for(int i=0;i<10;i++){
            arr[i]=sc.next();
            ans+=arr[i].length();
        }

        System.out.println(ans);
        
    }
}