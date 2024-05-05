import java.util.Scanner;
class Student
{
    String name,city;
    int age;

    void addData(String n, String c, int a)
    {
        name = n;
        city = c;
        age = a;
    }

    void printData()
    {
        System.out.println("Student Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Student Age: " + age);
    }
}

class Assignment4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        String name,city;
        int age;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter city: ");
        city = sc.next();
        System.out.print("Age: ");
        age = sc.nextInt();
        s1.addData(name,city,age);
        System.out.print("Enter name: ");
        sc.nextLine();
        name = sc.next();
        System.out.print("Enter city: ");
        sc.nextLine();
        city = sc.next();
        System.out.print("Age: ");
        age = sc.nextInt();
        s2.addData(name,city,age);
        System.out.println("----------------");
        System.out.println("OUTPUT");
        System.out.println("----------------");
        s1.printData();
        System.out.println("----------------");
        s2.printData();
        sc.close();
    }
}