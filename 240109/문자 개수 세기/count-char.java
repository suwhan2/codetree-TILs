import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int count=0;
        char a = sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==a){
                count++;
            }
        }
        System.out.println(count);

    }
}