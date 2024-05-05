import java.util.Scanner;
class Student2
{
    private int roll;
    private String name;

    void getData(int roll, String name)
    {
        this.name = name;
        this.roll = roll;
    }

    void display()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}

class Assignment2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        System.out.print("Enter Roll Number: ");
        int rollnum = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter another name: ");
        String name1 = sc.nextLine();
        System.out.println("-".repeat(20));

        System.out.print("Enter another roll number: ");
        int rollnum1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name2 = sc.nextLine();
        System.out.println("-".repeat(20));
        System.out.println("-".repeat(20));
        System.out.println("OUTPUT");

        s1.getData(rollnum,name1);

        
        s2.getData(rollnum1,name2);

        s1.display();
        System.out.println("-".repeat(20));
        s2.display();
        sc.close();
    }
}