import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String strArr[] = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        char charInput = sc.next().charAt(0);
        int count=0;
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].charAt(2)==charInput || strArr[i].charAt(3)==charInput){
                System.out.println(strArr[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}