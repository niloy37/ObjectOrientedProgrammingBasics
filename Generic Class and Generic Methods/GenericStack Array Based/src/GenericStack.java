public class GenericStack<E>  {
    private E [] array;
    private int top;


    public GenericStack(){
        array = (E[]) new Object[10];
        this.top = -1;
    }

    public int getSize(){
        return this.top+1;
    }
    public void push(E o ){
        top++;
        array[top] = o;
    }
    public E pop() throws StackEmptyException {
        if(top == -1) throw new StackEmptyException("Empty Stack");
        else {
            E o = array[top];
            top--;
            return o;
        }
    }
    public void doublePop ()  throws StackEmptyException {
        if(top <= 0) throw new StackEmptyException("Less than two Elements found");
        else top-=2;
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public void display(){
        for(int i=0;i<= top ;i ++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

}

