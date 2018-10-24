/**
 * @author Le Minh Tam
 * @version 1.2
 * @date 24.10.2018
 * @mainFunction calculate
 */

public class Square extends Expression {

    private Expression expression;

    Square(Expression expression1) {
        this.expression = expression1;
    }

    public Expression expression1() {
        return this.expression;
    }

    public String toString() {
        return (Integer.toString(expression.evaluate()))
                + "^2";
    }

    public int evaluate() {
        if (expression instanceof Numeral) {
            Numeral x = (Numeral) expression;
            return x.evaluate() * x.evaluate();
        }
        return 0;
    }
}
