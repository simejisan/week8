/**
 * @author Le Minh Tam
 * @version 1.2
 * @date 24.10.2018
 * @mainFunction calculate
 */

public class Addition extends BinaryExpression {
    private Expression left;
    private Expression right;

    Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression left() {
        return this.left;
    }

    public Expression right() {
        return this.right;
    }

    public String toString() {
        if (right.evaluate() > 0) {
            return (Integer.toString(left.evaluate())) +
                    " + " + (Integer.toString(right.evaluate()))
                    + " = " +
                    (Integer.toString(this.evaluate()));
        } else {
            return (Integer.toString(left.evaluate())) +
                    " + " + "(" +
                    (Integer.toString(right.evaluate()))
                    + ")" + " = " +
                    (Integer.toString(this.evaluate()));
        }
    }

    public int evaluate() {
        if (left instanceof Numeral && right instanceof Numeral) {
            Numeral x = (Numeral) left;
            Numeral y = (Numeral) right;
            return (x.evaluate() + y.evaluate());
        }
        return 0;
    }
}
