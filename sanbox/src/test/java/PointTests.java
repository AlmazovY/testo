
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistanceEquals(){
        Point p1 = new Point(10,20);
        Point p2 = new Point (30,30);
        Assert.assertEquals(p1.distance(p2),22.360679774997898);
    }

    @Test
    public void testDistanceNotEquals(){
        Point p1 = new Point(10,20);
        Point p2 = new Point (30,30);
        Assert.assertNotEquals(p1.distance(p2), 22);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void testDistanceAssertError() {
        Point p1 = new Point(10,20);
        Point p2 = new Point (30,30);
        Assert.assertEquals(p1.distance(p2),22);
    }
}
