import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String nToString = Integer.toString(n);
        int ans =0;
        for(int i=0;i<nToString.length();i++){
            char tmp = nToString.charAt(i);
            ans+= tmp-'0';
        }
        System.out.println(ans);

    }
}