/**
 * @author Le Minh Tam
 * @version 1.2
 * @date 24.10.2018
 * @mainFunction calculate
 */
public class Multilication extends BinaryExpression {
    private Numeral left;
    private Numeral right;

    Multilication(Numeral left, Numeral right) {
        this.left = left;
        this.right = right;
    }

    public Numeral left() {
        return this.left;
    }

    public Numeral right() {
        return this.right;
    }

    public String toString() {
        return (Integer.toString(left.evaluate())) +
                " * " + (Integer.toString(right.evaluate()))
                + " = " +
                (Integer.toString(this.evaluate()));
    }

    public int evaluate() {
        if (left instanceof Numeral && right instanceof Numeral) {
            Numeral x = left;
            Numeral y = right;
            return (x.evaluate() * y.evaluate());
        }
        return 0;
    }
}

