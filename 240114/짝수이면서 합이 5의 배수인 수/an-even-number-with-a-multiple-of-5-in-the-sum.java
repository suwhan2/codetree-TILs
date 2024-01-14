import java.util.Scanner;

public class Main {
    public static boolean checkNum(int n){
        if(n%2!=0){
            return false;
        }
        if((n/10+n%10)%5!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkNum(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}