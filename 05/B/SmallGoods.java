public class SmallGoods extends Goods{
   
    public SmallGoods(String type, int num, int unitprice, String destination){
        super(type, num, unitprice, destination);
    } 

    public int getCharge(){
        return 1000;
    }

}
