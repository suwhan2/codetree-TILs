import java.util.Scanner;

public class Main {
    public static String returnReverseString(String s){
        char tmp[] = new char[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            tmp[s.length()-1-i]=s.charAt(i);
        }
        String ans = String.valueOf(tmp);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String strInput = sc.next();
        String reversedStr = returnReverseString(strInput);
        if(strInput.equals(reversedStr)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}