public class DynamicArray {

    private int[] theArray;
    private int elementCount;

    // Constructor to initialize the array with a fixed size
    public DynamicArray(int max){
        theArray = new int[max];
        elementCount = 0;
    }

    // Insert an item into the array
    public void insert(int item){
        if (elementCount < theArray.length) {
            theArray[elementCount++] = item;
        } else {
            throw new ArrayIndexOutOfBoundsException("Array is full. Handle resizing outside this class.");
        }
    }

    // Display the elements in the array
    public void display(){
        for (int i = 0; i < elementCount; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println();
    }

    // Public method to start merge sorting
    public void mergeSort(){
        if (elementCount <= 1) return;  // No need to sort if 0 or 1 element
        int[] workSpace = new int[elementCount];
        recMergeSort(workSpace, 0, elementCount - 1);
    }

    // Recursive merge sort
    private void recMergeSort(int[] workSpace, int lowerBound, int upperBound){
        if (lowerBound == upperBound) {
            return;  // Base case: only one element
        } else {
            int mid = (lowerBound + upperBound) / 2;

            // Sort lower half
            recMergeSort(workSpace, lowerBound, mid);

            // Sort upper half
            recMergeSort(workSpace, mid + 1, upperBound);

            // Merge the two halves
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    // Merging two sorted sub arrays
    private void merge(int[] workSpace, int leftPtr, int rightPtr, int upperBound){
        int j = 0;  // Workspace index
        int lowerBound = leftPtr;
        int mid = rightPtr - 1;
        int n = upperBound - lowerBound + 1;  // Total number of items to merge

        // Merge the two halves into workSpace
        while (leftPtr <= mid && rightPtr <= upperBound) {
            if (theArray[leftPtr] < theArray[rightPtr]) {
                workSpace[j++] = theArray[leftPtr++];
            } else {
                workSpace[j++] = theArray[rightPtr++];
            }
        }

        // Copy remaining elements from the left half
        while (leftPtr <= mid) {
            workSpace[j++] = theArray[leftPtr++];
        }

        // Copy remaining elements from the right half
        while (rightPtr <= upperBound) {
            workSpace[j++] = theArray[rightPtr++];
        }

        // Copy sorted elements back into the original array
        for (j = 0; j < n; j++) {
            theArray[lowerBound + j] = workSpace[j];
        }
    }
}
