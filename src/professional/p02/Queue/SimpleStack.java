package professional.p02.Queue;

public class SimpleStack {
    private final int maxSize;
    private final long[] stackArray;
    private int top;

    public SimpleStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long element) {
        stackArray[++top] = element;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

class StackMain {
    public static void main(String[] args) {
        SimpleStack simpleStack = new SimpleStack(10);
        simpleStack.push(10);
        simpleStack.push(20);
        simpleStack.push(30);
        System.out.println("pop() :" + simpleStack.pop());
        System.out.println("peek() :" + simpleStack.peek());
        System.out.println(simpleStack.isEmpty());
        isEmpty(simpleStack);
        System.out.println(simpleStack.isEmpty());
    }

    private static void isEmpty(SimpleStack simpleStack) {
        while (!simpleStack.isEmpty()) {
            long popElement = simpleStack.pop();
            System.out.println(popElement);
        }
    }
}
