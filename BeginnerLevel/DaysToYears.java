import java.util.Scanner;
public class DaysToYears
{
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		int days=sc.nextInt();
		int years=days/365;
		int re_yr=days%365;
		System.out.println(years+"Yr " + "+ "+ re_yr + "days");
    }
	}
}