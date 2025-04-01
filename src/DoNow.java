public class DoNow {
    public static void main(String[] args) throws Exception {
        A obj = new B();
        obj.sayHello();
    }
}

class A { 
    public void sayHello() { System.out.println("Hello from A"); } 
}
class B extends A { 
    public void sayHello() { System.out.println("Hello from B"); } 
}

// “What will the output be, and why?”