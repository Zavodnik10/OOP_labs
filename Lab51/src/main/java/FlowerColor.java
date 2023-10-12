public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF");
    private final String presentation;

    FlowerColor(String presentation) {
        this.presentation = presentation;
    }

    @Override
    public String toString() {
        return presentation;
    }
}
