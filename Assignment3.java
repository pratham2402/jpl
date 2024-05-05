import java.util.Scanner;
class Vehicle
{
    String registration;
    String color;
    String model;

    void Details(String rgst, String clr, String modl)
    {
        registration = rgst;
        color = clr;
        model = modl;
    }

    void display()
    {
        System.out.println("Registration Number: " + registration);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
    }

}

class Car extends Vehicle
{
    void cc(int value)
    {
        System.out.println("CC: "+ value);
    }
    void fueltype(String fuel)
    {
        System.out.println("Fuel Type: "+fuel);
    }
}

class Truck extends Car
{
    void cc(int value)
    {
        System.out.println("CC: "+ value);
    }
    void fueltype(String fuel)
    {
        System.out.println("Fuel Type: "+fuel);
    }
}

class Bike extends Truck
{
    void cc(int value)
    {
        System.out.println("CC: "+ value);
    }
    void fueltype(String fuel)
    {
        System.out.println("Fuel Type: "+fuel);
    }
}

class Assignment3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Vehicle v = new Vehicle();
        Car c = new Car();
        Truck t = new Truck();
        Bike b = new Bike();
        String registration, color, model, fuel;
        int cc;
        System.out.print("Enter registration number: ");
        registration = sc.nextLine();
        System.out.print("Enter color: ");
        color = sc.next();
        sc.nextLine();
        System.out.print("Enter model: ");
        model = sc.next();
        System.out.print("Enter Fuel Type: ");
        fuel = sc.next();
        System.out.print("Enter CC: ");
        cc = sc.nextInt();
        c.Details(registration, color, model);
        System.out.println("--------------------------");
        System.out.println("Car");
        c.display();
        c.cc(cc);
        c.fueltype(fuel);
        
        System.out.println("--------------------------");

        sc.nextLine();
        
        System.out.print("Enter registration number: ");
        registration = sc.nextLine();
        System.out.print("Enter color: ");
        color = sc.nextLine();
        System.out.print("Enter model: ");
        model = sc.nextLine();
        System.out.print("Enter Fuel Type: ");
        fuel = sc.nextLine();
        System.out.print("Enter CC: ");
        cc = sc.nextInt();
        
        t.Details(registration, color, model);
        System.out.println("--------------------------");
        System.out.println("Truck");
        t.display();
        t.cc(cc);
        t.fueltype(fuel);

        System.out.println("--------------------------");
        
        
        sc.nextLine();
        System.out.print("Enter registration number: ");
        registration = sc.nextLine();
        System.out.print("Enter color: ");
        color = sc.next();
        System.out.print("Enter model: ");
        model = sc.next();
        sc.nextLine();
        System.out.print("Enter Fuel Type: ");
        fuel = sc.next();
        System.out.print("Enter CC: ");
        cc = sc.nextInt();
        b.Details(registration, color, model);
        System.out.println("--------------------------");
        System.out.println("Bike");
        b.display();
        b.cc(cc);
        b.fueltype(fuel);

        System.out.println("--------------------------");

        sc.close();
    }
}
