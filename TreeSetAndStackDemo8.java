import java.util.Stack;
import java.util.TreeSet;

public class TreeSetAndStackDemo8 {
    public static void main(String[] args) {
        // TreeSet Example
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        System.out.println("TreeSet: " + treeSet);

        treeSet.remove(5);
        System.out.println("After removing 5: " + treeSet);
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());

        // Stack Example
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack: " + stack);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
