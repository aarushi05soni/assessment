enum HotTeaType {
    MASALA(15), BLACK(10);
    private final int value;

    HotTeaType(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
}
