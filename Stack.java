class Stack{
    private int [] stackarray;                           //private to don't modify variable
    private int top;
    private int ms;

    public Stack(int size){                              // to initialize the instance variable after create object of class
        this.ms=size;
        this.top=-1;
        this.stackarray=new int[size];
    }
    public void push(int value){
        if(isFull()){                                    //function return true to execute block
            System.out.println("Stack OverFlow");
            return;                                      //to stop the execution of whole function
        }
        stackarray[++top]=value;
        
    }
    public int pop(){                                   
        if(isEmpty()){                                  //function return true to execute block
            System.out.println("UnderFlow");
            return -1;
        }
        return stackarray[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("UnderFlow");
            return -1;
        }
        return stackarray[top];
    }
    public boolean isFull(){                           // check array is full to return true otherwise false
        return top==ms-1;
        
    }
    public boolean isEmpty(){                         // check array is empty to return true otherwise false
        return top==-1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("No Element");
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.println(stackarray[i]+" ");     // To print one by one element of array unil top
        }
        System.out.println();

    }
    public static void main(String args[]){
        Stack s=new Stack(5);                    // create object of class

        s.push(10);                             // use reference variable to call function/property of class
        s.push(15);
        
        s.pop();
        s.push(14);
        s.display();                                 // Test cases 10 14
        s.push(10);
        s.push(15);
        s.push(20);
        s.display();                                // Expected: 10 14 10 15 20

        System.out.println("Popped: " + s.pop());   // Expected: 20

        s.display();                                // Expected: 10 15

        s.push(25);
        s.push(30);                           // Expected: Stack Overflow
        s.push(35);                           // Expected: Stack Overflow 
        s.push(40);                          // Expected: Stack Overflow
        s.display();                               // Expected: 10 14 10 15 25 

        System.out.println("Peek: " + s.peek());   // Expected: 25
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop(); 
        s.pop();                                   // Expected: Stack Underflow

    }
}