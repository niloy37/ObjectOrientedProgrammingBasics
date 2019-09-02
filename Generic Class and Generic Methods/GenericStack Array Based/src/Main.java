import java.util.*;
public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> obj = new GenericStack<Integer>();
        obj.push(5);
        obj.push(6);
        obj.push(7);
        obj.display();
        System.out.println("Is Empty? "+ obj.isEmpty());
        // trying to pop elements
        try {
            System.out.println(obj.pop());
            System.out.println(obj.pop());
            System.out.println("Current Size: "+obj.getSize());
            obj.doublePop();
        }catch(StackEmptyException e ){
            System.out.println("Only One Element in Stack");
        }
    }
}
