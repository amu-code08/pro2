public abstract class Goods {
    private String type;
    private int num;
    private int unitprice;
    private String destination;
  
    public Goods(String type, int num, int unitprice, String destination){
      this.type = type;
      this.num = num;
      this.unitprice = unitprice;
      this.destination = destination;
  
    }
  
    public String getType(){
      return type;
    }
  
    public int getNum(){
      return num;
    }
  
    public int getUnitPrice(){
      return unitprice;
    }
  
    public String getDestination(){
      return destination;
    }
  
    public void setDestination(String s){
      this.destination = s;
    }
  
    public void setNum(int n){
      this.num = n;
    }
  
    public int getTotalPrice(){
      return this.unitprice * this.num;
    }
  
    public void print(){
      System.out.println();
    }
  
    abstract int getCharge();
}

