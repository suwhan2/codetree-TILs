import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char arr[] = str2.toCharArray();
        arr[0] = str1.charAt(0);
        arr[1] = str1.charAt(1);
        String ans = String.valueOf(arr);
        System.out.println(ans);
    }
}