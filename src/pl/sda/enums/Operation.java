package pl.sda.enums;

public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public double calculate(double a, double b) {
        double x=0.0;
        switch (this) {
            case PLUS:
                x = a + b;
                break;
            case MINUS:
                x = a - b;
                break;
            case MULTIPLY:
                x = a * b;
                break;
            case DIVIDE:
                x = a / b;
                break;
        }
        return x;
    }


    public void checkEnum (String a) {

    }

}
