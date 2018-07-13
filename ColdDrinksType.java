enum ColdDrinksType {
    PEPSI(45), COCA_COLA(45), MIRINDA(45);
    private final int value;

    ColdDrinksType(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
}
