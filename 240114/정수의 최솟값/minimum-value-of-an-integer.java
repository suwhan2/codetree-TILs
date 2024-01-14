import java.util.Scanner;

public class Main {
    public static int findSmallestValue(int a,int b,int c){
        int sNum=a;
        if(sNum>b){
            sNum=b;
        }
        if(sNum>c){
            sNum=c;
        }

        return sNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = findSmallestValue(a,b,c);
        System.out.println(ans);
    }
}