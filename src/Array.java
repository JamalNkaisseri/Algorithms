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

    public int getMax(){

        if(elementCount == 0){
            return -1;
        }else {
         return  arr[elementCount-1];
        }
    }

    public int getMin(){

        if(elementCount == 0){
            return -1;
        }else {
            return  arr[0];
        }
    }

    public void display(){
        for(int i = 0;i < elementCount;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void swap(int one,int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public void bubbleSort(){

        int i,j;

        //Outer loop tracks the sorted items
        for(j = elementCount-1;j > 1;j--){

            //Inner loop starts at the left
            for(i = 0;i < j;i++){
                if(arr[i] > arr[i+1]){
                    swap(i,i+1);
                }
            }
        }
    }

    public void selectionSort(){
        //Sorted items appear on the left
        int i,j,temp;

        //Outer loop acts as a marker for sorted items
        for(j = 0;j < elementCount-1;j++){

            //Store the index of the first item
            temp = j;


            //Inner loop starts at the second item
            for(i = j+1;i < elementCount;i++){
                if(arr[i] < arr[temp]){

                    //Store index of smallest item
                    temp = i;
                }
            }
            swap(j,temp);
        }
    }

    public void insertionSort(){
        int i,j;

        //Loop starts at the 2nd element
        //We assume the fist element is already sorted

        for(j = 1;j < elementCount;j++){

            //Store the 2nd item in a temp variable
            int temp = arr[j];

            //Place a marker at the gap left by the 2nd item
            i = j;

            while(i > 0 && arr[i-1] > temp){

                //Shift items to the right
                arr[i] = arr[i-1];

                //Move the marker to the gap left by the shifted item
                i--;
            }

            //Store the item in the temp variable at the resulting gap
            arr[i] = temp;
        }
    }
}