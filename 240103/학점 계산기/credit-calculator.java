import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum=0;
        for(int i =0;i<n;i++){
            sum+=sc.nextDouble();
        }
        sum/=n;
        System.out.printf("%.1f\n",sum);
        if(sum>=4.0){
            System.out.println("Perfect");
        }
        else if(sum>=3.0){
            System.out.println("Good");
        }
        else{
            System.out.println("Poor");
        }
    }
}