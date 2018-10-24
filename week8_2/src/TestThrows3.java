
public class TestThrows3{
    public static int ArithmeticException (int a, int b){
        if(b == 0)
            throw new ArithmeticException();
        return a/b;
    }
    public static void main (String[] args){
        int a = 10;
        int b = 0;
        System.out.println(ArithmeticException(a,b));
    }
}
