class Prob18{

    public static int addcommonfactor(int a){
        int total = 0;
        for(int i = 1; i<a; i++){
            if(a%i == 0){
                total += i;
            }
        }
        return total;
    }
    public static void main(String[] args){
        for(int i = 1; i<1000; i++){
        if(i == addcommonfactor(i)){
            System.out.println(i);
        }
    }
    }

}