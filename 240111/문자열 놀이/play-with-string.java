import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.next();
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int n=sc.nextInt();
            if(n==1){
                int a= sc.nextInt();
                int b= sc.nextInt();
                char arr[] = str1.toCharArray();
                arr[a-1]=str1.charAt(b-1);
                arr[b-1] = str1.charAt(a-1);
                str1=String.valueOf(arr);
                System.out.println(str1);
                
            }
            else if(n==2){
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                char arr[] = str1.toCharArray();
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==a){
                        arr[j]=b;
                    }
                }
                str1=String.valueOf(arr);
                System.out.println(str1);
            }
        }
    }
}