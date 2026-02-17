import java.util.Scanner;

public class CelciustoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double C = sc.nextDouble();
        double F = (C * 9 / 5) + 32;
        System.out.println(F);
        sc.close();
    }
}
