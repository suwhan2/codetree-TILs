public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
                double ftToCm = 30.48;
        double miToCm = 160934;
        double ftProblem = 9.2;
        double miProblem = 1.3;
        double ans1 = ftProblem * ftToCm;
        double ans2 = miProblem * miToCm;


        System.out.printf("%.1fft = %.1fcm\n",ftProblem,ans1);
        System.out.printf("%.1fmi = %.1fcm",miProblem,ans2);
    }
}