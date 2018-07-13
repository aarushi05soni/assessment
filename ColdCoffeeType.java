enum ColdCoffeeType {
    OREO(110), FRAPPE(125);
    private final int value;

    ColdCoffeeType(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
}
