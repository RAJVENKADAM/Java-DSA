import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int max=Integer.MIN_VALUE;
            char choice;
            do{
                System.out.print("Enter a number: ");
                int num=sc.nextInt();
                if(num>max){
                    max=num;
                }
                System.out.print("Another number?(Y/N)");
                choice=sc.next().charAt(0);
                
            }while(choice=='y'||choice=='Y');
            System.out.println("Greatest Number is "+max);
        }
    }
}
