import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String strInput = sc.next();
        int n = strInput.length();
        System.out.println(strInput);
        for(int i=0;i<n;i++){
            strInput = strInput.substring(n-1)+strInput.substring(0,n-1);
            System.out.println(strInput);
        }
    }
}