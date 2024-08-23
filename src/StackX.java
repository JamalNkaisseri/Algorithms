public class StackX {

    int top;
    int maxSize;
    int [] stackArray;

    public StackX(int s){
        maxSize = s;
        top = -1;
        stackArray = new int[maxSize];
    }

    public void push(int item){

        //Top arrow moves up and item is inserted
        stackArray[++top] = item;
    }

    public int pop(){

        //Item is removed before decrementing top arrow
        return stackArray[top--];
    }

    public int peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }
}