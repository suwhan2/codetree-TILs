import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        int n = inputString.length();
        boolean eeResult = false;
        boolean abResult = false;

        for(int i=0;i<n-1;i++){
            if(inputString.charAt(i)=='e'&&inputString.charAt(i+1)=='e'){
                eeResult=true;
            }
            if(inputString.charAt(i)=='a'&&inputString.charAt(i+1)=='b'){
                abResult=true;
            }
        }

        if(eeResult==true){
            System.out.print("Yes"+" ");
        }
        else{
            System.out.print("No"+" ");
        }

        if(abResult==true){
            System.out.print("Yes"+" ");

        }
        else{
            System.out.print("No"+" ");
        }
    }
}