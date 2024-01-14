import java.util.Scanner;

public class Main {
    public static void printStar(int n,int m){
        int cri;
        int des;
        if(n>m){
            cri=n;
            des=m;
        }else{
            cri=m;
            des=n;
        }
        int ans=0;
        for(int i=cri;i<=cri*des;i++){
            if(i%n==0&&i%m==0){
                ans=i;
                break;
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