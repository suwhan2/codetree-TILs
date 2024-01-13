import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numSum=0;
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            numSum+=num;
        }

        String numToString = Integer.toString(numSum);
        System.out.println(numToString.substring(1)+numToString.charAt(0));

    }
}