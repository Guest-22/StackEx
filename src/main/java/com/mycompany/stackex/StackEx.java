package com.mycompany.stackex;

import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {
        // ---------------------------------------------------------------------------
        // Stack:   follows the LIFO rule (Last-In, First-Out)
        //          elements are added and removed from the top of the stack
        //
        // Methods: .push();    -   inserts the value at the top of the stack
        //          .pop();     -   removes the top value of the stack
        //          .peek();    -   returns the top value w/o removing it
        //          .size();    -   returns the total size of the stack
        //          .isEmpty(); -   returns a boolean (true/false) (true = empty, false = not empty)
        // ---------------------------------------------------------------------------
        
        // ---------------------------------------------------------------------------
        // Instruction:
        // Initial Values: A = 5, B = 3, C = 7
        // A stack stk is created and starts as empty. Identify what will be the 
        // status of the stack as well as the return value for each stack operation. 
        // In the column stack contents, the top element is at the far right and 
        // kindly separate the elements using comma style.
        // ---------------------------------------------------------------------------
        
        Stack<Integer> stk = new Stack<>();
        
        int a = 5, b = 3, c = 7;
        
        /*
        System.out.println("stk.isEmpty(): " + stk.isEmpty());
        System.out.println("stk.push(a): " + stk.push(a));
        System.out.println("stk.push(b): " + stk.push(b));
        System.out.println("stk.push(c * c): " + stk.push(c * c));
        System.out.println("stk.peek(): " + stk.peek());
        */
        // ---------------------------------------------------------------------------
        // If the instruction said: b = stk.pop();
        // This means that it removes the top value from the stack and assigns it to variable b (b = 48, not b = 3)
        // Since the .pop() method takes no argument but rather takes the value from the top of the stack
        // stk.pop(b); // This will throw an error 
        // 
        // Else if we wanna remove the value of variable b (not the top value), we can use the .remove() method of stack
        // System.out.println(stk.remove(Integer.valueOf(b)));
        // System.out.println(stk);
        //
        // Documentation Details of .pop() method of Stack:
        /* Removes the object at the top of this stack and returns that
        *  object as the value of this function.
        *
        *  @return  The object at the top of this stack (the last item
        *          of the {@code Vector} object).
        *  @throws  EmptyStackException  if this stack is empty.

        public synchronized E pop() {
            E       obj;
            int     len = size();

            obj = peek();
            removeElementAt(len - 1);

            return obj;
       } */
        // ---------------------------------------------------------------------------
        
        /*
        System.out.println("b = stk.pop(): " + (b = (int) stk.pop())); 
        System.out.println("stk.size(): " + stk.size());
        System.out.println("stk.push(b + a): " + stk.push(b + a));
        System.out.println("stk.isEmpty(): " + stk.isEmpty());
        System.out.println("a = stk.pop(): " + (a = (int) stk.pop()));
        System.out.println("c = stk.pop(): " + (c = (int) stk.pop()));
        System.out.println("stk.size(): " + stk.size());
        System.out.printf("Updated Values of A = %d, B = %d, C = %d.", a, b, c);
        */
        
        
        
        // ----------------------------Updated layout---------------------------------
        // a = 5, b = 3, c = 7
        String stkCnt = "\nStack Contents: ", retVal = "\nReturn Value: ";
        
        System.out.println("stk.isEmpty()" + stkCnt + stk + retVal + stk.isEmpty());
        
        stk.push(a);
        System.out.println("\nstk.push(a)" + stkCnt + stk + retVal);
        
        stk.push(b);
        System.out.println("\nstk.push(b)" + stkCnt + stk + retVal);
        
        stk.push(c*c);
        System.out.println("\nstk.push(c * c)" + stkCnt+ stk + retVal);
        
        System.out.println("\nstk.peek()" + stkCnt + stk + retVal + stk.peek());
        
        b = stk.pop(); // .pop() method removes the stack's top value & assigns it to variable b (old b = 3) (new b = 49)
        System.out.println("\nb = stk.pop()" + stkCnt + stk + retVal + b); 
        
        System.out.println("\nstk.size()" + stkCnt + stk + retVal + stk.size());
        
        stk.push(b+a);
        System.out.println("\nstk.push(b + a)" + stkCnt  + stk + retVal);
        
        System.out.println("\nstk.isEmpty()" + stkCnt + stk + retVal + stk.isEmpty());
        
        a = stk.pop(); // .pop() method removes the stack's top value & assigns it to variable a (old a = 5) (new a = 54)
        System.out.println("\na = stk.pop()" + stkCnt + stk + retVal + a);
        
        c = stk.pop(); // .pop() method removes the stack's top value & assigns it to variable c (old c = 7) (new c = 3)
        System.out.println("\nc = stk.pop()" + stkCnt + stk + retVal + c);
        
        System.out.println("\nstk.size()" + stkCnt +stk + retVal + stk.size());
        
        System.out.printf("\nUpdated Values of A = %d, B = %d, C = %d.", a, b, c);
        // ----------------------------Updated layout---------------------------------
   }
}