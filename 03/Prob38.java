public class Prob38 {
    public static void main(String[] args){
        MyPointNew p, q;
        p = new MyPointNew();
        q = new MyPointNew();

        p.setPoint(20, 23);
        q.setPoint(4, 21);

        System.out.print("The distance between the two points is " + p.getDistanceFrom(q));
    }
}
