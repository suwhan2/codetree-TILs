import java.util.Scanner;

public class Main {
    public static boolean checkHowManyAlphabet(String s){
        int n =s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(0)!=s.charAt(i)){
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strInput = sc.next();
        if(checkHowManyAlphabet(strInput)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}