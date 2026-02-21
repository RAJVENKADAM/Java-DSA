import java.util.Scanner;

public class GSTcalculation {
    public static void main(String[] args) {

        try(Scanner sc=new Scanner(System.in)){

        System.out.print("Product Price: ");
        double Pr = sc.nextDouble();

        System.out.print("GST Percentage: ");
        double GST = sc.nextDouble();

        double gst = GST / 100;
        double G = Pr * gst;
        double o = Pr + G;

        System.out.println(o + " is the price with GST.");

        }
    }
}