import java.util.Scanner;
public class ReverseNumbers
{
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		int a=sc.nextInt();
		int sum=0;
		while (a>0){
		    sum=(a%10)+(sum*10);
		    a/=10;
		}
		System.out.println(sum);
	}
	}
}