
public class TestThrows1{
    public static String  pointer(String a, String b){
        if(a == null || b == null)
            throw new NullPointerException();
        return a+b;
    }
    public static void main (String[] args){
        String a = null;
        String b = null;
        System.out.println(pointer(a,b));
    }
}
