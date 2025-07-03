import model.MinStack;

public class Main {
    public static void main(String[] args) {
        var minStack = new MinStack();
        minStack.push(1);
        minStack.push(-1);
        minStack.push(2);

        System.out.println(minStack.min);
    }
}
