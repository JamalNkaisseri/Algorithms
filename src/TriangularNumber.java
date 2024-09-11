public class TriangularNumber {

    public int triangle(int n){

        if(n == 1){
            System.out.println("Returning 1");
            return 1;
        }else {
            int temp = n + triangle(n-1);
            System.out.println("Returning " + temp);
            return temp;
        }
    }
}
