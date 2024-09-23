public class Main {
    public static void main(String[] args) {

      int maxSize = 16;

      Array array = new Array(maxSize);

      array.insert(149);
      array.insert(192);
      array.insert(47);
      array.insert(152);
      array.insert(159);
      array.insert(195);
      array.insert(61);
      array.insert(66);
      array.insert(17);
      array.insert(167);
      array.insert(118);
      array.insert(64);
      array.insert(27);
      array.insert(80);
      array.insert(30);
      array.insert(105);

      array.display();

      array.quickSort();

      array.display();






    }
}
