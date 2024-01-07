import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[11];
        int fiveCount=0;
        for(int i=0;i<11;i++){
            if(fiveCount==2){
                break;
            }
            arr[i]=n*(i+1);
            if(arr[i]%5==0){
                fiveCount++;
            }
        }
        for(int i=0;i<11;i++){
            if(arr[i]==0){
                break;
            }
            System.out.print(arr[i]+" ");
        }

    }
}