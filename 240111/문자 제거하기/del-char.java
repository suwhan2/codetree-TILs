import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.next();
        while(true){
            if(str1.length()==1){
                break;
            }
            int n = sc.nextInt();
            if(n>=str1.length()){
                str1=str1.substring(0,str1.length()-1);
                System.out.println(str1);
            }
            else{
                str1=str1.substring(0,n)+str1.substring(n+1);
                System.out.println(str1);
            }

        }
    }
}