import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        String cri = sc.next();
        int inputStrN = inputStr.length();
        int criN = cri.length();
        int ans =-1;
        for(int i=0;i<=inputStrN-criN;i++){
            if(inputStr.substring(i,i+criN).equals(cri)){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}