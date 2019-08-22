package my.application.test;

import java.util.EmptyStackException;
import java.util.Stack;

public class WordStack {

    public static void main(String... args) {
        System.out.println(wordStackMachine("13 DUP 4 POP 5 DUP + DUP + -"));
        System.out.println(wordStackMachine("5 6 + -"));
        System.out.println(wordStackMachine("3 DUP 5 - -"));
    }

    private static int wordStackMachine(String S) {
        int combination = 0;
        final double MAX_VALUE = Math.pow(2, 20)-1;
        Stack<Integer> stack = new Stack<>();
        String[] words = S.split("\\s+");
        try {
            for (String word : words) {
                switch (word) {
                    case "POP":
                        //remove top value out of stack
                        stack.pop();
                        break;
                    case "DUP":
                        //duplicate the top value in stack
                        stack.push(stack.peek());
                        break;
                    case "+":
                        //remove 2 top values and add the sum back in stack
                        combination = stack.pop() + stack.pop();
                        if (combination <= MAX_VALUE) stack.push(combination);
                        else return -1;
                        break;
                    case "-":
                        //remove 2 top values and add the subtraction value back in stack
                        combination = stack.pop() - stack.pop();
                        if (combination > 0) stack.push(combination);
                        else return -1;
                        break;
                    default:
                        //push new value in stack
                        stack.push(Integer.parseInt(word));
                }
            }
            return stack.pop();
        } catch (EmptyStackException exception) {
            return -1;
        }
    }
}
