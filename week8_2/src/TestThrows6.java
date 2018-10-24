
public class TestThrows6{
    public static void ClassCastException (Object a, Object b) {
        if (!(b instanceof Integer))
            throw new ClassCastException();
    }

    public static void main (String[] args){
        Integer a = null;
        String b = new String("A");
        ClassCastException(a,b);
        //System.out.println(ClassCastException(a, b));
    }
}
