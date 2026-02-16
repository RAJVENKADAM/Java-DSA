import java.util.Scanner;

public class SwapUseArith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap, the value of A is\t" + a);
        scan.close();
    }
}