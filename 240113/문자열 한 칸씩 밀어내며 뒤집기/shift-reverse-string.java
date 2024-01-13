import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String strInput = sc.next();
        int n = strInput.length();
        int q= sc.nextInt();
        for(int i=0;i<q;i++){
            int qu = sc.nextInt();
            if(qu==1){
                strInput = strInput.substring(1,n)+strInput.charAt(0);
                System.out.println(strInput);
            }
            else if(qu==2){
                strInput = strInput.charAt(n-1)+strInput.substring(0,n-1);
                System.out.println(strInput);
            }
            else{
                char arr[] = new char[n];
                arr=strInput.toCharArray();
                char tmp[] = new char[n];
                for(int j=0;j<n;j++){
                    tmp[j]=arr[n-j-1];
                }
                strInput =String.valueOf(tmp);
                System.out.println(strInput);
            }
        }

    }
}