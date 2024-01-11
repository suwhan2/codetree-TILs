import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.next();
        String ans1 = str1.substring(0,1)+str1.substring(2);
        String ans2 = ans1.substring(0,ans1.length()-2)+ans1.substring(ans1.length()-1);
        System.out.println(ans2);
    }
}