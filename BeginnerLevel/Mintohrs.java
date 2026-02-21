import java.util.Scanner;
public class Mintohrs
{
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		int min=sc.nextInt();
		int hr=min/60;
		int re_hr=min%60;
		System.out.println(hr+"hr " + "+ "+ re_hr + "mins");
		}
	}
}