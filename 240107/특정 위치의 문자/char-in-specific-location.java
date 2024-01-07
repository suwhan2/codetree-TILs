import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = new char[]{'L','E','B','R','O','S'};
        int charInput = sc.next().charAt(0);
        int no =0;
        for(int i=0;i<6;i++){
            if(arr[i]==charInput){
                System.out.println(i);
                no=1;
            }
        }
        if(no==0){
            System.out.println("None");
        }

    }
}