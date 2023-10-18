package B;

class Prob75{
    public static void main(String[] args){
    if(args.length == 0){
        System.out.println("No numbers!");
    } else {
        int s1;
        int s2;
        int s3;
        int temp;
        String x; String reversed;
        for(int k = 0; k < args.length; k++){
            x = args[k];
            reversed = "";
            s1 = 0;
            s2 = 0;
            s3 = 0;

            for(int i = x.length()-1; i >= 0; i--){
                reversed += x.charAt(i);
            }

            for(int i = 0; i < reversed.length(); i+=2){
                s1 += Character.getNumericValue(reversed.charAt(i));
            }

            for(int i = 1; i < reversed.length(); i+=2){
                temp = Character.getNumericValue(reversed.charAt(i))*2;
                if(temp >= 10){
                    s2 += temp%10 + temp/10;
                } else {
                    s2 += temp;
                }
            }

            s3 = s1+s2;
            if(s3%10 == 0){
                System.out.println(x + " " + s3  + " Good");
            } else {
                System.out.println(x + " " + s3  + " Bad");
            }
            }
        }
    }
}