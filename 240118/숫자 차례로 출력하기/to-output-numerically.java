import java.util.Scanner;
public class Main {
    public static void printUpStair(int n){
        if(n==0){
            return;
        }
        printUpStair(n-1);
        System.out.print(n+" ");
    }
    public static void printDownStair(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printDownStair(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printUpStair(n);
        System.out.println();
        printDownStair(n);
    }
}