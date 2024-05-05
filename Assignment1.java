import java.util.Scanner;  
public class Assignment1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter first number- ");  
        int a = sc.nextInt();  
        System.out.print("Enter second number- ");  
        int b = sc.nextInt();  
        System.out.print("Enter third number- ");  
        int c = sc.nextInt();
        System.out.print("Enter fourth number- ");  
        int d = sc.nextInt();
        sc.close();
        if(a==b & b==c & c==d)
        {
            System.out.println("All Are Equal");
        }
        else
        {
            System.out.println("All Are Not Equal");
        }

    }
}