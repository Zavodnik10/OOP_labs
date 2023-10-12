import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;

    public String getColor() {
        return color.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.sepalLength, sepalLength) == 0 &&
                Double.compare(flower.price, price) == 0 &&
                color == flower.color;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sepalLength);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
