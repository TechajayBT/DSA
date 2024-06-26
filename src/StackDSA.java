public class StackDSA {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public StackDSA(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Method to add an element to the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = element;
    }

    // Method to remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Method to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to get the size of the stack
    public int size() {
        return top + 1;
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        StackDSA stack = new StackDSA(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); // Stack Overflow

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());

        stack.pop();
        stack.pop();

        System.out.println("Top element after pop operations: " + stack.peek());
        System.out.println("Stack size after pop operations: " + stack.size());
    }
}
