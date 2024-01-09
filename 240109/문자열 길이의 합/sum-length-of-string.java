import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        int ans=0;
        int acount=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
            if(arr[i].charAt(0)=='a'){
                acount++;
            }
            ans+=arr[i].length();
        }

        System.out.println(ans+" "+ acount);

    }
}