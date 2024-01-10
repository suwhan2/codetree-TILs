import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        String inputString="";
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
            inputString+=arr[i];
        }

        for(int i=0;i<inputString.length();i++){
            System.out.print(inputString.charAt(i));
            if((i+1)%5==0){
                System.out.println();
            }
        }

    }
}