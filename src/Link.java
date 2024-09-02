public class Link {

    int iData;
    double dData;
    public Link next;

    public Link(int id, double dd){
        iData = id;
        dData = dd;
        //Next is automatically set to null
    }

    public void displayLink() // display
    {
        System.out.print("{" + iData + "," + dData + "}");
    }
}
