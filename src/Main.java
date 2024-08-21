public class Main {
    public static void main(String[] args) {

        Array array = new Array(10);

        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.insert(60);
        array.insert(70);
        array.insert(80);
        array.insert(90);
        array.insert(100);

        array.display();

        int searchKey = 75;

        if(array.find(searchKey) != array.length()){
            System.out.println("Found " + searchKey);
        }else {
            System.out.println("Did not find " + searchKey );
        }

        System.out.println("The maximum value is " + array.getMax());
        System.out.println("The minimum value is " + array.getMin());

    }
}
