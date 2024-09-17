public class Merge {

    // This is to understand how merge works in merge sort
    public void merge(int[] arrayA, int sizeA,
                      int[] arrayB, int sizeB,
                      int[] arrayC) {

        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;

        // Loop until one of the arrays is fully traversed
        while (aIndex < sizeA && bIndex < sizeB) {
            // Compare items in A and B
            // Store the smaller item in array C
            if (arrayA[aIndex] < arrayB[bIndex]) {
                arrayC[cIndex++] = arrayA[aIndex++];
            } else {
                arrayC[cIndex++] = arrayB[bIndex++];
            }
        }

        // At this point, either arrayA or arrayB has been fully traversed.
        // Copy the remaining elements from arrayA, if any.
        while (aIndex < sizeA) {
            arrayC[cIndex++] = arrayA[aIndex++];
        }

        // Copy the remaining elements from arrayB, if any.
        while (bIndex < sizeB) {
            arrayC[cIndex++] = arrayB[bIndex++];
        }
    }

    public void display(int[] theArray, int size) {
        for (int j = 0; j < size; j++) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println();
    }
}
