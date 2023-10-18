public class BigGoods extends Goods{
   
    public BigGoods(String type, int num, int unitprice, String destination){
        super(type, num, unitprice, destination);
    } 

    public int getCharge(){
        return 5000;
    }

}
