package pl.sda.enums;

public class Test {
    public static void main(String[] args) {
        System.out.println(Operation.PLUS.calculate(120, 230));
        System.out.println(Operation.DIVIDE.calculate(120, 230));
        System.out.println(Operation.MINUS.calculate(130, 50));
        System.out.println(Operation.MULTIPLY.calculate(100, 2));

        System.out.println(Currency.DOLAR.toZloty(250));
        System.out.println(Currency.EURO.fromZloty(350));

    }
}
