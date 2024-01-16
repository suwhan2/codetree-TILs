import java.util.Scanner;
class NumsWrapper{
    int value;
    public NumsWrapper(int n){
        this.value=n;
    }
}
public class Main {
    public static void compaerAndProcessNum(NumsWrapper n1, NumsWrapper n2){
        if(n1.value>n2.value){
            n1.value+=25;
            n2.value*=2;
        }else{
            n2.value+=25;
            n1.value*=2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        NumsWrapper n1 = new NumsWrapper(a);
        NumsWrapper n2 = new NumsWrapper(b);

        compaerAndProcessNum(n1,n2);
        System.out.println(n1.value+" "+ n2.value);
    }
}