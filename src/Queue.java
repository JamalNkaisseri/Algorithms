public class Queue {

    int front;
    int rear;
    int maxSize;
    int elementCount;
    int [] queArray;

    public Queue(int s){
        maxSize = s;
        front = 0;
        rear = -1;
        elementCount = 0;
        queArray = new int[maxSize];
    }

    public void insert(int item){

        //Deal with wrap around
        if(rear == maxSize - 1){
            rear = -1;
        }

        queArray[++rear] = item;
        elementCount++;
    }

    public int remove(){

        //Deal with wrap around
        if(front == maxSize){
            front = 0;
        }

        int temp = queArray[front++];
        elementCount--;

        return temp;
    }

    public int peekFront(){
        return queArray[front];
    }

    public int size(){
        return elementCount;
    }

    public boolean isEmpty(){

        return (elementCount == 0);
    }

    public boolean isFull(){

        return (elementCount == maxSize);
    }
}