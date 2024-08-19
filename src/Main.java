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

        int searchKey = 55;

        if(array.find(searchKey)){
            System.out.println("Found " + searchKey);
        }else {
            System.out.println("Did not find " + searchKey);
        }

        array.delete(20);
        array.delete(90);
        array.delete(40);

        array.display();

    }
}
