package Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Niraj");
        stack.push("Virat");
        stack.push("Ronaldo");
        stack.push("John");

        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        stack.pop();
        System.out.println(stack.peek());
    }
}
