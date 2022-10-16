package String;

import java.util.Stack;


public class MyQueue{


    public static Stack<Integer> stack,temp;


    public MyQueue() {
        stack=new Stack<>();
        temp=new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
    
        while(!stack.isEmpty()){
             temp.push(stack.pop());

        }
    
        int  res =temp.pop();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return res;
}
    
    public int peek() {
     
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
    
        int res=temp.peek();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return res;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
 
 public static void main(String[] args) {
     MyQueue obj = new MyQueue();
     obj.push(5);
     obj.push(3);
     
     int param_3 = obj.peek();
     int param_2 = obj.pop();
     boolean param_4 = obj.empty();
     System.out.println(param_2);
     System.out.println(param_3);
     System.out.println(param_4);
}


 }