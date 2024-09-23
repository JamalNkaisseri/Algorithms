public class Sorting {

    public void insertionSort(int[] array){
        int i,j;

        //Start the loop at the 2nd element assuming the 1st is sorted
        for(i = 1;i < array.length;i++){

            //Initialize a temp variable to store the 2nd element
            int temp = array[i];

            //Place a marker at the gap left by the 2nd element
            j = i;

            while (j > 0 && array[j-1] >= temp){

                //Shift elements to the right
                array[j] = array[j-1];

                //Move the marker to the space left by the element shifted
                j--;
            }

            //Place the stored element in the resulting gap
            array[j] = temp;
        }
    }

    public void bubbleSort(int [] array){
        int i,j;

        //Outer loop acts as a marker for the sorted elements
        for(j = array.length-1;j > 1;j--){

            //Inner loop starts at the first element
            for(i = 0;i < j;i++){
                if(array[i] > array[i+1]){
                    swap(array,i,i+1);
                }
            }
        }
    }


    public void selectionSort(int [] array){
        int i,j,temp;

        //Sorted items appear to the left
        for(j = 0;j < array.length-1;j++){

            //Store the index of the 1st element
            temp = j;

            //Inner loop begins at the 2nd element
            for(i = j+1;i < array.length;i++){
                if(array[i] < array[temp]){

                    //Store index of the smallest element
                    temp = i;
                }
            }
            swap(array,j,temp);
        }
    }



  public void swap(int[] value,int i,int j){
     int temp = value[i];
     value[i] = value[j];
     value[j] = temp;
  }
 }
