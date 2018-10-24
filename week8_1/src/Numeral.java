/**
 * @author Le Minh Tam
 * @version 1.2
 * @date 24.10.2018
 * @mainFunction calculate
 */

public class Numeral extends Expression {
    private int value;

    Numeral(int value) {
        this.value = value;
    }

    public String toString() {
        return (Integer.toString(value));

    }

    public int evaluate() {
        return value;
    }
}
