public class Array {

    int [] arr;//Reference to array
    int elementCount;

    //Constructor
    public Array(int size){
        arr = new int[size];
        elementCount = 0;
    }

    public void insert(int value){

        //Insert element
        arr[elementCount] = value;

        //Increment to reflect increase in size
        elementCount++;
    }

    public boolean find(int searchKey){
       int i;
       for(i = 0;i < elementCount;i++){
           if(arr[i] == searchKey){
               break;
           }
       }
       if(i == elementCount){
          return false;
       }else {
           return true;
       }
    }

    public boolean delete(int value){

        int i;
        for(i = 0;i < elementCount;i++){
            if(arr[i] == value){
                break;
            }
        }

        if(i == elementCount){
            return false;
        }else {

            //Shift items to the left
            int j;
            for(j = i;j < elementCount-1;j++){
                arr[j] = arr[j+1];
            }
            elementCount--;
        }
        return true;
    }

    public void display(){
        for(int i = 0;i < elementCount;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}