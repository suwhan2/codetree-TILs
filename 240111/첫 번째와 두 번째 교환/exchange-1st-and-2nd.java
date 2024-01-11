import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.next();
        char arr[] = str1.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==str1.charAt(0)){
                arr[i]=str1.charAt(1);
            }
            else if(arr[i]==str1.charAt(1)){
                arr[i]=str1.charAt(0);
            }
        }
        String ans = String.valueOf(arr);
        System.out.println(ans);
    }
}