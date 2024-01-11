import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String strInput = sc.next();
        char arr[] = strInput.toCharArray();

        arr[1]='a';
        arr[arr.length-2]='a';

        strInput=String.valueOf(arr);
        System.out.println(strInput);
    }
}