import java.util.Scanner;

public class Main {

    public static int[] makeMRoute(int m){
        int mRoute[] = new int[m];
        mRoute[0]=m;
        int p=1;
        while(m!=1){
            if(m%2==1){
                m-=1;
                mRoute[p]=m;
                p++;
            }else{
                m/=2;
                mRoute[p]=m;
                p++;
            }
        }
        return mRoute;
    }
    public static int calculateRoute(int arr[], int arr2[]){
        int sum=0;
        for (int j : arr) {
            if (j == 0) {
                break;
            }
            sum += arr2[j - 1];
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tmp[] = makeMRoute(m);

        int ans = calculateRoute(tmp,arr);
        System.out.println(ans);

    }
}