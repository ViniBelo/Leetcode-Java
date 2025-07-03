package model;

import java.util.Stack;

public class MinStack {
    public Stack<Integer> stack;
    public Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (min.empty() || val < min.lastElement()) {
            min.push(val);
        } else min.push(getMin());
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.lastElement();
    }

    public int getMin() {
        return min.lastElement();
    }
}
