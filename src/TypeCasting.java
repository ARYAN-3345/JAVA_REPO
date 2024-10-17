public class TypeCasting {
    public static void main(String args[]){

        //UP CASTING
        short sh = 123;
        int IntData = sh;
        System.out.println(IntData);

        float fl = 234.345f;
        double db = fl;
        System.out.println(db);

        //down casting
        double dbd = 234.64743839;
        float fld = (float) dbd;
        System.out.println(fld);

        int IntVar = 1234567;
        short shd = (short) IntVar;
        System.out.println(shd);
    }
}
