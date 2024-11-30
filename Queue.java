public class Queue {
    private int []array;                                       // private to don't modify variable
    private int front;
    private int rear;
    private int mx;

    public Queue(int size){                                    // to initialize the instance variable after create object of class
        this.array=new int[size];
        this.front=0;
        this.rear=-1;
        this.mx=size;
    }
    public void push(int value){
        if(isFull()){                                          //function return true to execute block
            System.out.println("Overflow");
            return;                                            // to stop the execution of whole function
        }
        System.out.println(array[++rear]=value);               // print push value
    }
    public int pop(){
        if(isEmpty()){                                         //function return true to execute block
            System.out.println("UnderFlow");
            return -1;
        }
        return array[front++];                                // return first push value (FIFO)
        
    }
    public boolean isFull(){                                  // check array is full to return true otherwise false
        return rear==mx-1;
    }
    public boolean isEmpty(){                                 // check array is empty to return true otherwise false
        return front>rear;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("No Element");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(array[i]+" ");                   // To print one by one element of array
        }
    }

    public static void main(String[] args) {
        Queue g=new Queue(5);                            // create object of class
        
        g.push(11);                                     // use reference variable to call function/property of class
        g.push(12);
        g.push(13);
        g.pop();
        g.push(14);
        g.push(15);
        g.display();
        
        
    }
}
