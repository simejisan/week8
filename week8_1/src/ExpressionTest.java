/**
 * @author Le Minh Tam
 * @version 1.2
 * @date 24.10.2018
 * @mainFunction calculate
 */

public class ExpressionTest {
    public static void main(String[] args) {
        Numeral num1 = new Numeral(10);
        //System.out.println(num1);
        //Numeral num2 = new Numeral(new Square(num1));
        Square num2 = new Square(num1);
        //Square(num1)
        //System.out.println(num2.toString());

        Numeral num3 = new Numeral(num2.evaluate());
        //System.out.println(num3.toString());
        Numeral num5 = new Numeral(-1);
        Addition num4 = new Addition(
                num3, num5);
        //System.out.println(num4.toString());
        Numeral num6, num7;
        num6 = new Numeral(0);
        num7 = new Numeral(3);

        Addition num8 = new Addition(num7, num7);
        //Numeral n8 = new Numeral(num8.evaluate());
        Addition num9 = new Addition((new Numeral(num8.evaluate())),
                (new Numeral(num4.evaluate())));
        //System.out.println(num9);
        Square num10 = new Square(new Numeral(num9.evaluate()));
        System.out.println("(10^2 - 1 + 2*3)^2 = " + num10.evaluate() + "\n");

        Division test = new Division(num7, num6);
        System.out.println("Test Exception: 3 / " + test.evaluate());
    }
}
