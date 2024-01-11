import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        char cri = sc.next().charAt(0);
        int ans =inputStr.indexOf(cri);
        if(ans==-1){
            System.out.println("No");
        }else {
            System.out.println(ans);
        }

    }
}