public class test {
    public static void main(String[] args){
        try {
            System.out.println("Before a");
            a();
            System.out.println("After a");
        }
        catch (NumberFormatException e){System.out.println("main:" + e);}
        finally {System.out.println("main: finally");}
    }

    public static void a() {
        try {
            System.out.println("Before b");
            b();
            System.out.println("After b");
        }
        catch (NumberFormatException e) {System.out.println("a: "+ e); throw e;}
        finally {System.out.println("a: finally");}
    }

    public static void b() {
        try {
            Integer i = Integer.valueOf("1234");
            System.out.println(i);
        }
        catch (NumberFormatException e){throw e;}
        finally {System.out.println("b: finally");}
    }
}