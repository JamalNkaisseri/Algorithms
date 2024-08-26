public class Main {
    public static void main(String[] args) {

        PriorityQueue thePq = new PriorityQueue(5);

        thePq.insert(30);
        thePq.insert(10);
        thePq.insert(20);
        thePq.insert(50);
        thePq.insert(40);

        while (!thePq.isEmpty()){
            int value = thePq.remove();
            System.out.print(value + " ");
        }


    }
}
