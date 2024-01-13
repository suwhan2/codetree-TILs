import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String strInput = sc.next();
            if(strInput.equals("END")){
                break;
            }

            for(int i=strInput.length()-1;i>=0;i--){
                System.out.print(strInput.charAt(i));
            }
            System.out.println();



        }
    }
}