public class DoubleLink {

   public int iData;
   public DoubleLink next;

   public DoubleLink(int iD){
       iData = iD;
       //Next is automatically set to null
   }

   public void displayLink(){
       System.out.print(iData + " ");
   }
}
