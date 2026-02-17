import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double P = Sc.nextDouble();
        double R = Sc.nextDouble();
        double T = Sc.nextDouble();
        double SI = (P * R * T) / 100;
        System.out.println(SI);
        Sc.close();
    }
}
