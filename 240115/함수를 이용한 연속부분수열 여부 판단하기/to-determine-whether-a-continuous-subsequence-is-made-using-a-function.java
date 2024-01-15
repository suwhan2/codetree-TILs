import java.util.Scanner;

public class Main {
    public static boolean checkConsecutiveNumberSubSequence(int arr1[],int arr2[]){
        boolean ans = false;
        for(int i=0;i<=arr1.length-arr2.length;i++){
            for(int j=i;j<i+arr2.length;j++){
                if(arr1[j]!=arr2[j-i]){
                    ans=false;
                    break;
                }
                ans=true;

            }
            if(ans){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int arrA[] = new int[n1];
        for(int i=0;i<n1;i++){
            arrA[i]=sc.nextInt();
        }

        int arrB[] = new int[n2];
        for(int i=0;i<n2;i++){
            arrB[i]=sc.nextInt();
        }

        if(checkConsecutiveNumberSubSequence(arrA, arrB)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}