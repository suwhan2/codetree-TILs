import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char char1 = sc.next().charAt(0);
        char char2 = sc.next().charAt(0);
        int ans1 = (int)char1+(int)char2;
        int ans2 = (int)char1-(int)char2;
        if (ans2 < 0) {
            ans2*=-1;
        }

        System.out.println(ans1+" "+ans2);
    }
}