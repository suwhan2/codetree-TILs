import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        int n = inputStr.length();
        int eeCount=0;
        int ebCount=0;
        for(int i=0;i<n-1;i++){
            if(inputStr.substring(i,i+2).equals("ee")){
                eeCount+=1;
            }
            if(inputStr.substring(i,i+2).equals("eb")){
                ebCount+=1;
            }
        }
        System.out.print(eeCount+" "+ebCount);

    }
}