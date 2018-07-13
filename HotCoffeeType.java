enum HotCoffeeType {
    LATTE(40), CAPPUCCINO(50), EXPRESSO(30);
    private final int value;

    HotCoffeeType(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
}
