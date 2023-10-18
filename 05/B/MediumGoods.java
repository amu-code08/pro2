public class MediumGoods extends Goods{
   
    public MediumGoods(String type, int num, int unitprice, String destination){
        super(type, num, unitprice, destination);
    } 

    public int getCharge(){
        return 3000;
    }

}

