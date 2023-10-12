import java.util.List;
import java.util.ArrayList;

public class Store {
    private final List<FlowerBucket> buckets = new ArrayList<>();// List to store FlowerBucket objects

    public void add(FlowerBucket bucket) {
        buckets.add(bucket);
    }// Add a FlowerBucket to the store

    public FlowerBucket search(FlowerBucket bucket) {
        for (FlowerBucket bucketBucket : buckets) {
            if (bucketBucket.equals(bucket)) {
                return bucketBucket;
            }
        }
        return null;
    }
}
