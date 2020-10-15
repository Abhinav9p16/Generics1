import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestMax {
    Integer[] intArray = {1, 2, 5, 4, 3};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
    String[] strArray = {"Apple", "Peach", "Banana"};

    @Test
    public void testMaxInt() {
        Assert.assertTrue("The max element is 5" ,new PArray<>(intArray).getMaxElement(intArray));
    }
    @Test
    public void testMaxDouble() {
        Assert.assertTrue("The max element is 4.4" ,new PArray<>(doubleArray).getMaxElement(doubleArray));
    }
    @Test
    public void testMaxStr(){
        Assert.assertTrue("The max element is Peach",new PArray<>(strArray).getMaxElement(strArray));
    }
}
