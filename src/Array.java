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



    public void shellSort(){
        int i, j, temp;

        // Initialize gap size. The first gap value is set to 1.
        int h = 1;

        // Calculate the largest gap size based on the array length.
        // This uses Knuth's sequence: 1, 4, 13, 40, 121, ...
        // The goal is to start with the largest gap and reduce it.
        while(h < elementCount / 3){
            h = (h * 3) + 1;
        }

        // Perform the gapped insertion sort with the current gap size.
        // Decrease the gap until it becomes 1.
        while(h > 0){

            // Outer loop: Iterate through the array starting from the index `h`.
            // The index `j` moves from `h` to `elementCount - 1`.
            for(j = h; j < elementCount; j++){

                // Store the current element in a temporary variable.
                temp = arr[j];

                // Start at the current index `j` and move backward by the gap size `h`.
                i = j;

                // Inner loop: Shift elements that are greater than `temp` to the right.
                // The loop runs as long as `i` is greater than or equal to `h`
                // and the element at `i - h` is greater than `temp`.
                while(i >= h && arr[i - h] > temp){

                    // Shift the element at `i - h` to position `i`.
                    arr[i] = arr[i - h];

                    // Move the index `i` back by `h` positions.
                    i -= h;
                }

                // Place the `temp` element in its correct position.
                arr[i] = temp;
            }
            //Outer loop goes forward while the inner loop goes backwards h steps

            // Reduce the gap size using the formula `(h - 1) / 3`.
            // This moves to the next smaller gap value.
            h = (h - 1) / 3;
        }
    }

    public int partitionIt(int left, int right, int pivot) {
        int leftPtr = left - 1; // Start just before the left boundary
        int rightPtr = right;   // Start at the right boundary

        while (true) {
            // Increment leftPtr until we find an element >= pivot
            while (arr[++leftPtr] < pivot);

            // Decrement rightPtr until we find an element <= pivot
            while (rightPtr > 0 && arr[--rightPtr] > pivot) ;


            // If pointers cross, partitioning is done
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }

        // Swap the pivot to its final position
        swap(leftPtr, right); // Ensure the pivot is in the right place

        // Return the final position of the pivot
        return leftPtr;
    }

    public void quickSort() {
        recQuickSort(0, elementCount - 1);
    }

    public void recQuickSort(int left, int right) {
        // If the size is <= 1 then it is already sorted
        if (right - left <= 0) {
            return;
        } else {
            // Let the pivot be the rightmost element
            int pivot = arr[right];
            int partition = partitionIt(left, right, pivot);

            // Sort left side
            recQuickSort(left, partition - 1);
            // Sort right side
            recQuickSort(partition + 1, right);
        }
    }


}