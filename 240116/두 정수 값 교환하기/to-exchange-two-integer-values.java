import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value){
        this.value=value;
    }
}

public class Main {
    public static void swap(IntWrapper n, IntWrapper m){
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        IntWrapper i1 = new IntWrapper(n);
        IntWrapper i2 = new IntWrapper(m);

        swap(i1,i2);
        System.out.println(i1.value+" "+i2.value);

    }
}