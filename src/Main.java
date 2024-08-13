public class Main {
    public static void main(String[] args) {
        Sorting sort = new Sorting();

        int [] numbers = {4,1,8,2,10,3,7,5,9,6};

        sort.insertionSort(numbers);

        for(int i : numbers){
            System.out.print(i + " ");
        }
    }
}
