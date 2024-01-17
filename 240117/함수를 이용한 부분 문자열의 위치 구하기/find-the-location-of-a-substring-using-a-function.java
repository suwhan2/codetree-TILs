import java.util.Scanner;

public class Main {
    public static String strInput, desStr;

    public static boolean compareTwoStr(int n){
        for(int i=n;i<n+desStr.length();i++){
            if(strInput.charAt(i)!=desStr.charAt(i-n)){
                return false;
            }
        }
        return true;
    }

    public static int checkInvolveArr(){
        int ans =-1;
        for(int i=0;i<=strInput.length()-desStr.length();i++){
            if(compareTwoStr(i)){
                ans=i;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        strInput = sc.next();
        desStr = sc.next();

        System.out.println(checkInvolveArr());

    }
}