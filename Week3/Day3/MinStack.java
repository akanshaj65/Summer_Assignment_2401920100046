package Week3.Day3;

import java.util.Stack;

public class MinStack {
   Stack<Integer> s1 ;
    Stack<Integer> s2 ;

    public MinStack() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int val) {
        if(s2.isEmpty()){
            s1.push(val);
            s2.push(val);
            return;
        }
        s1.push(val);
        s2.push(Math.min(val,s2.peek()));
    }
    
    public void pop() {
        s1.pop();
        s2.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}
