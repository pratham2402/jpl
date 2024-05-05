// Define the interface
interface MyInterface {
    void method1(); // Method declaration
    void method2(); // Another method declaration
}

// Implement the interface in a class
class MyClass implements MyInterface {
    // Override method1
    @Override
    public void method1() {
        System.out.println("Inside method1");
    }

    // Override method2
    @Override
    public void method2() {
        System.out.println("Inside method2");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {
        // Create an object of the implementation class
        MyClass obj = new MyClass();
        // Call methods of the interface through the implementation class object
        obj.method1();
        obj.method2();
    }
}
