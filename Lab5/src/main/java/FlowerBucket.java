import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlowerBucket {
    private final List<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack pack) {
        packs.add(pack);
    }

    public double getPrice() {
        double totalPrice = 0;
        for (FlowerPack pack : packs) {
            totalPrice += pack.getPrice();
        }
        return totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerBucket that = (FlowerBucket) o;
        return Objects.equals(packs, that.packs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packs);
    }
}
