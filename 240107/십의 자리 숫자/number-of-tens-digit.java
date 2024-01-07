import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count[] = new int[10];
        for(int i=0;i<100;i++){
            int tmp = sc.nextInt();
            if(tmp==0){
                break;
            }
            if(tmp>9){
                count[tmp/10]++;
            }
        }

        for(int i=1;i<=9;i++){
            System.out.println(i+" - "+count[i]);
        }
    }
}