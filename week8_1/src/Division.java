public class Division extends BinaryExpression {
    private Numeral left;
    private Numeral right;

    Division (Numeral left, Numeral right){
        this.left = left;
        this.right = right;
    }
    public Numeral left(){
        return this.left;
    }
    public Numeral right(){
        return this.right;
    }
    public String toString(){
        return (Integer.toString( left.evaluate())) +
                " / " +(Integer.toString(right.evaluate()))
                + " = " +
                (Integer.toString(this.evaluate()));
    }
    public int evaluate() throws ArithmeticException{
        try {
            if (left instanceof Numeral && right instanceof Numeral){
            Numeral x = left;
            Numeral y = right;
            return (x.evaluate() / y.evaluate());
        }
    }catch (Exception e){
            System.out.println("Error devide by zero!");
        }
        return 0;
    }
}
