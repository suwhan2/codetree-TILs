import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int score[] = new int[10];
        int cnt=0;
        for(int i=0;i<10;i++){
            int tmp = sc.nextInt();
            if(tmp==0){
                break;
            }
            score[i] = tmp;
            cnt++;
        }
        cnt-=1;
        for(int i=cnt;i>-1;i--){
            System.out.print(score[i]+" ");
        }
    }
}