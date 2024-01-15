import java.util.Scanner;

public class Main {
    public static void calculateNum(int a, char o,int c){
        int ans=0;
        if(o=='+'){
            ans= a+c;
            System.out.println(a+" "+o+" "+c+" = "+ans);
            return;
        }
        if(o=='-'){
            ans =a-c;
            System.out.println(a+" "+o+" "+c+" = "+ans);
            return;
        }
        if (o == '/') {
            ans= a/c;
            System.out.println(a+" "+o+" "+c+" = "+ans);
            return;
        }
        if(o=='*'){
            ans = a*c;
            System.out.println(a+" "+o+" "+c+" = "+ans);
            return;
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o =sc.next().charAt(0);
        int c = sc.nextInt();

        calculateNum(a,o,c);

    }
}