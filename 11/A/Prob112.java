import java.util.ArrayList;

public class Prob112 {
    public int gcd(int x, int y){
        // 最大公約数を計算し，その結果を返す．
        assert x > 0 && y > 0;
        ArrayList<Integer> xfactors = new ArrayList<Integer>();
        ArrayList<Integer> yfactors = new ArrayList<Integer>();
        ArrayList<Integer> commonfactors = new ArrayList<Integer>();


        for(int i = 1; i <= x; i++){
            if(x%i == 0){
                xfactors.add(i);
            }
        }

        for(int i = 1; i <= y; i++){
            if(y%i == 0){
                yfactors.add(i);
            }
        }

        for(Integer f : xfactors){
            if(yfactors.contains(f)){
                commonfactors.add(f);
            }
        }

        return commonfactors.get(commonfactors.size()-1);
    }
}
