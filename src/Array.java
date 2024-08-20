public class Array {

    int [] arr;//Reference to array
    int elementCount;

    //Constructor
    public Array(int size){
        arr = new int[size];
        elementCount = 0;
    }

    public int length(){
        return elementCount;
    }

    public void insert(int value){

        //Insert element
        arr[elementCount] = value;

        //Increment to reflect increase in size
        elementCount++;
    }

  public int find(int searchKey){
        int lowerBound = 0;
        int upperBound = elementCount - 1;
        int curIn; //Current index

      while(true){

          //Calculate midpoint
          curIn = (lowerBound + upperBound) / 2;

          if(arr[curIn] == searchKey){
              return curIn; //Found at midpoint
          }else if(lowerBound > upperBound){
              return elementCount; //Element not found
          }else {
              if(arr[curIn] > searchKey){
                  //It is in the lower half
                  upperBound = curIn - 1;
              }else {

                  //It is in the upper half
                  lowerBound = curIn + 1;
              }
          }
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