public class Sorting {

   public void insertionSort(int [] array){
       int i,j;

       //Initialize the loop to start at the second element in the array
       for(i = 1;i < array.length;i++){

           //Store the 2nd element in a temp variable
           int temp = array[i];

           //Place the marker at the gap left by the 2nd element
           j = i;

           while(j > 0 && array[j-1] > temp){

               //Shift items to the right as long as conditions are satisfied
               array[j] = array[j-1];

               //Move the marker to the space left by decrementing it
               j--;
           }
           //Store the element in the space that's there
           array[j] = temp;
       }
   }
}
