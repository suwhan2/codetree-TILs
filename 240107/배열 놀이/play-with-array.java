import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<q;i++){
            int problemNumber = sc.nextInt();
            int a = sc.nextInt();

            //질문 1
            if(problemNumber==1){
                System.out.println(arr[a]);
            }
            //질문 2
            if(problemNumber==2){
                int p =0;
                for(int j =1;j<=n;j++){
                    if(arr[j]==a){
                        System.out.println(j);
                        p=1;
                        break;
                    }
                }
                if(p==0){
                    System.out.println(0);
                }
            }
            //질문 3
            if(problemNumber==3){
                int b = sc.nextInt();
                for(int j=a;j<=b;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }

    }
}