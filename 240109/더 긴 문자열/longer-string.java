import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        String b = sc.next();
        if(a.length()>b.length()){
            System.out.print(a+" "+a.length());
        }
        else if(a.length()<b.length()){
            System.out.print(b+" "+b.length());
        }
        else{
            System.out.println("same");
        }


    }
}