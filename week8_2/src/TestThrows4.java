
public class TestThrows4{
    public static int ArrayIndexOfBoundException (int a[], int b){
        for (int i=0;i<10;i++){
            if (b != a[i])
                throw new ArrayIndexOutOfBoundsException();
        }
        return b;
    }
    public static void main (String[] args){
        int a[] = {1,2,3,4,5,6,7,8,9,0};
        int b = 100;
        System.out.println(ArrayIndexOfBoundException(a, b));
    }
}
