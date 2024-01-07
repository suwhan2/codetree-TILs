import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력부
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arrN1[] = new int[n1];
        int arrN2[] = new int[n2];

        for(int i=0;i<n1;i++){
            arrN1[i]= sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arrN2[i]= sc.nextInt();
        }
        //기능부
        boolean ans = false;
        int startNum = arrN2[0];

        for(int i=0;i<n1;i++){
            if(arrN1[i]==startNum){
                int k = i+1;
                for(int j=1;j<n2;j++){
                    if(arrN2[j]!=arrN1[k]){
                        break;
                    }
                    k++;
                    if(j==n2-1){
                        ans=true;
                    }
                }

            }
        }


        //출력부
        if(ans){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}