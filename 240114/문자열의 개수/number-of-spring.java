import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        String arr[] = new String[201];
        while (true){
            arr[count] = sc.next();
            if(arr[count].equals("0")){
                break;
            }
            count+=1;
        }

        System.out.println(count);
        for(int i=0;i<count;i+=2){
            System.out.println(arr[i]);
        }
    }
}