public class Truck extends Car {
    Goods[] cargo;
    int index;
    int size;

    public Truck(int num){
        this.cargo = new Goods[num];
        this.index = 0;
        this.size = num;

    }

    public void addGoods(Goods g){
        if(index == 0){
            cargo[index] = g;
            index++;
            return;
        } else{
            for(int i = 0; i < index; i++){
                if(g.getType().equals(cargo[i].getType())){
                    cargo[i].setNum(cargo[i].getNum()+g.getNum());
                    return;
                }
            }
            cargo[index] = g;
            index++;
            return;
        }
    }

    public int totalCargoValue(){
        int total = 0;
        for(int i = 0; i < index; i++){
            total += cargo[i].getTotalPrice();
        }
        return total;
    }

    public void showStatus(){
        int charge = 0;
        for(int i = 0; i < index; i++){
            System.out.println(i+"th goods in the cargo is: type = " + cargo[i].getType() + ", num = " + cargo[i].getNum() + ", Unit Price = " + cargo[i].getUnitPrice() + ", Destination" + cargo[i].getDestination());
            charge += cargo[i].getCharge();
        }  

        System.out.println("Total cargo value is " + this.totalCargoValue());
        System.out.println("Total shipping cost is " + charge);
        
    }
}
