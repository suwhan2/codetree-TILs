import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String strInput=sc.next();
        strInput=strInput+"0";
        int count=1;
        String ans="";
        for(int i=0;i<strInput.length()-1;i++){
            if(strInput.charAt(i+1)=='0'){
               ans+=strInput.charAt(i);
               ans+=count;
            }
            else if(strInput.charAt(i)==strInput.charAt(i+1)){
                count+=1;
            }
            else{
                ans+=strInput.charAt(i);
                ans+=count;
                count=1;
            }
        }
        System.out.println(ans.length());
        System.out.println(ans);
    }
}