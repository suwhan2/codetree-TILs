import java.util.Scanner;

public class Main {
    public static void printStar(int n,int m){
        int cri;
        if(n>m){
            cri=m;
        }else{
            cri=n;
        }
        int ans =1;
        for(int i=2;i<=cri;i++){
            if(n%i==0&&m%i==0){
                ans=i;
            }
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printStar(n,m);

    }
}