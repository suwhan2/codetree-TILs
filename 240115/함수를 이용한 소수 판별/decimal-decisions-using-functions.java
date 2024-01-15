import java.util.Scanner;

public class Main {
    public static boolean checkPrimeNum(int x){
        if(x==1){
            return false;
        }
        if(x==2){
            return true;
        }
        for(int i=2;i<=x-1;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;
        for (int i = a; i <= b; i++) {
            if (checkPrimeNum(i)) {
                sum+=i;
            }
        }

        System.out.println(sum);
    }
}