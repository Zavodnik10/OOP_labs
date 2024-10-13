public class FlowerPack {
    private final Flower flower;  // The type of flower in the pack
    private final int quantity;  // The quantity of the specified flower in the pack

    FlowerPack(Flower flower, int quantity) {
        this.flower = flower;  // Initialize the flower type
        this.quantity = quantity;  // Initialize the quantity
    }

    double getPrice() {
        return quantity * this.flower.getPrice();  // Calculate the total price of the flower pack
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;  // If the object is null, the two FlowerPacks are not equal
        }
        if (!(o instanceof FlowerPack)) {
            return false;  // If the object is not a FlowerPack, they are not equal
        }
        return quantity == ((FlowerPack) o).quantity && flower.equals(((FlowerPack) o).flower);  // Compare the quantity and type of flowers in two FlowerPacks for equality
    }
}
