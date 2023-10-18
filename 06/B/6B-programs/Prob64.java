public class Prob64 {
    public static void main(String[] args){
        int ans = 1;
        if(args.length == 0){
            System.out.println("No inputs");
        } else {
            for(String arg: args){
                ans*=Integer.valueOf(arg);
            }
        }
        System.out.println(ans);
    }
}
