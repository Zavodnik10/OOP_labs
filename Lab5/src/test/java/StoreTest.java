import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Random;


public class StoreTest {
    @Test
    public void testSearch() {
        Flower firstFlower = new Flower();
        Flower secondFlower = new Flower();
        Flower testfirstFlower = new Flower();
        Flower testsecondFlower = new Flower();
        Flower testFlowerThree = new Tulip();
        int priceOne = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int priceTwo = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantityOne = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int quantityTwo = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        firstFlower.setPrice(priceOne);
        firstFlower.setColor(FlowerColor.BLUE);
        secondFlower.setPrice(priceTwo);
        secondFlower.setColor(FlowerColor.RED);
        testfirstFlower.setPrice(priceOne);
        testfirstFlower.setColor(FlowerColor.BLUE);
        testsecondFlower.setPrice(priceTwo);
        testsecondFlower.setColor(FlowerColor.RED);
        testFlowerThree.setPrice(priceTwo);
        testFlowerThree.setColor(FlowerColor.RED);
        FlowerPack packOne = new FlowerPack(firstFlower, quantityOne);
        FlowerPack packTwo = new FlowerPack(secondFlower, quantityTwo);
        FlowerBucket bucket = new FlowerBucket();
        FlowerPack testPackOne = new FlowerPack(firstFlower, quantityOne);
        FlowerPack testPackTwo = new FlowerPack(secondFlower, quantityTwo);
        FlowerBucket testBucketOne = new FlowerBucket();
        FlowerPack testPackThree = new FlowerPack(testFlowerThree, quantityTwo);
        FlowerBucket testBucketTwo = new FlowerBucket();
        Store store = new Store();
        bucket.add(packOne);
        bucket.add(packTwo);
        testBucketOne.add(testPackOne);
        testBucketOne.add(testPackTwo);
        testBucketTwo.add(testPackOne);
        testBucketTwo.add(testPackThree);
        store.add(bucket);
        Assertions.assertSame(store.search(testBucketOne), bucket);
        Assertions.assertNotSame(store.search(testBucketTwo), bucket);
    }
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int MAX_QUANTITY = 10;
}
