import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextLine();
        }
        char alpInput = sc.next().charAt(0);
        int a=0;
        for(int i=0;i<10;i++){
            int n = arr[i].length();
            if(arr[i].charAt(n-1)==alpInput){
                System.out.println(arr[i]);
                a=1;
            }
        }
        if(a==0){
            System.out.println("None");
        }


    }
}