package pl.sda.enums;

public enum Currency {
    POLSKI_ZLOTY ("PLN", 1.0),
    DOLAR ("USD", 3.4),
    EURO ("EUR", 4.2),
    JEN ("JEN", 2.1),
    FUNT_BRYTYJSKI ("PBR", 5.2);

    private String symbol;
    private double kurs;

    Currency(String symbol, double kurs) {
        this.symbol = symbol;
        this.kurs = kurs;
    }

public double fromZloty (double a) {
        double result = 0.0;
        switch (this) {
            case FUNT_BRYTYJSKI:
                result = a / FUNT_BRYTYJSKI.kurs;
                break;
            case JEN:
                result = a / JEN.kurs;
                break;
            case EURO:
                result = a / EURO.kurs;
                break;
            case DOLAR:
                result = a / DOLAR.kurs;
                break;
            case POLSKI_ZLOTY:
                result = a / POLSKI_ZLOTY.kurs;
                break;
        }
        return result;
}

    public double toZloty (double a) {
        double result = 0.0;
        switch (this) {
            case FUNT_BRYTYJSKI:
                result = a * FUNT_BRYTYJSKI.kurs;
                break;
            case JEN:
                result = a * JEN.kurs;
                break;
            case EURO:
                result = a * EURO.kurs;
                break;
            case DOLAR:
                result = a * DOLAR.kurs;
                break;
            case POLSKI_ZLOTY:
                result = a * POLSKI_ZLOTY.kurs;
                break;
        }
        return result;
    }

}
