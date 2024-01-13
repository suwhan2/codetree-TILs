import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int c = a+b;
        int count=0;
        String ans =Integer.toString(c);
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)=='1'){
                count+=1;
            }
        }
        System.out.println(count);
    }
}