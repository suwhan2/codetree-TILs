import java.util.Scanner;

public class Main {
    public static int calcAddAll(int n){
        return (n*(n+1))/2/10;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = calcAddAll(n);
        System.out.println(ans);
    }
}