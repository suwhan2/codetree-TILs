import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int score[] = new int[4];
        int totalPassNumber=0;
        for(int i =0;i<numberOfStudents;i++){
            int sum=0;
            for(int j=0;j<4;j++){
                score[j]=sc.nextInt();
                sum+=score[j];
            }
            if (sum/4>60){
                System.out.println("pass");
                totalPassNumber+=1;
            }
            else{
                System.out.println("fail");
            }

        }
        System.out.println(totalPassNumber);

    }
}