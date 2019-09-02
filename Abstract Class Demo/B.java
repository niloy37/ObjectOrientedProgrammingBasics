public class B extends A {
    B() {

    }

    @Override
    public void Display() {
        System.out.println("Overriding abstract method of A from B");
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.Display();
    }
}


