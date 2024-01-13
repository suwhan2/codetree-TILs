import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char charInput = sc.next().charAt(0);
        if(charInput=='z'){
            System.out.println('a');
        }
        else{
            char ans =(char)((int)charInput+1);
            System.out.println(ans);
        }

    }
}