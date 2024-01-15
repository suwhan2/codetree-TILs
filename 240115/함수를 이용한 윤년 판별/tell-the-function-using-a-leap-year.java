import java.util.Scanner;

public class Main {
    public static boolean checkLeapYear(int x){
        if(x%4==0 && x%100==0 && x%400==0){
            return true;
        }
        if(x%4==0&& x%100==0){
            return false;
        }
        if(x%4==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y= sc.nextInt();
        System.out.println(checkLeapYear(y));
    }
}