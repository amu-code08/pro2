public class Prob86 {

    public static void main(String[] args){
        int a=0;
        int b=0;
        int sum=0;

        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Input TWO integers");
            System.exit(1);
        } catch(NumberFormatException e){
            System.out.println("please input INTEGERs");
            System.exit(1);
        }

        while(a >= 1){
            if(a%2 != 0){
                sum += b;
            }
            a = a/2;
            b = 2*b;
        }

        System.out.println(args[0] + "*" + args[1] + "=" + sum);


    }
}
