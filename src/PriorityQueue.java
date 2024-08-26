public class PriorityQueue {

    int maxSize;
    int elementCount;
    int [] pqArray;

    public PriorityQueue(int s){
        maxSize = s;
        elementCount = 0;
        pqArray = new int[maxSize];
    }

    public void insert(int item){

        //Largest item is at index zero
        int j;

        if(elementCount == 0){
            pqArray[elementCount] = item;
        }else{

            //Start at end of the array
            for(j = elementCount-1;j >= 0;j--){
                if(item > pqArray[j]){

                    //Shift to the right
                    pqArray[j+1] = pqArray[j];
                }else{
                    //End the loop when correct position is found
                    break;
                }
            }
            pqArray[j+1] = item;
        }
        elementCount++;
    }

    public int remove(){
        return pqArray[--elementCount];
    }

    public int peekMin(){
        return pqArray[elementCount-1];
    }

    public boolean isEmpty(){
        return (elementCount == 0);
    }

    public boolean isFull(){
        return (elementCount == maxSize);
    }
}