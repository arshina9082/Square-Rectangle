import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    void toFindAreaOfRectangleWithPositiveLengthAndBreadth()
    {
        Rectangle obj = new Rectangle(6,4);
        int expectedArea = 24;
        int actualArea = obj.area();
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void toFindAreaOfRectangleWithPositiveLengthAndNegativeBreadth()
    {
        Rectangle obj = new Rectangle(6,-4);
        int expectedArea = -24;
        int actualArea = obj.area();
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void toFindAreaOfRectangleWithNegativeLengthAndPositiveBreadth()
    {
        Rectangle obj = new Rectangle(-6,4);
        int expectedArea = -24;
        int actualArea = obj.area();
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void toFindAreaOfRectangleWithNegativeLengthAndBreadth()
    {
        Rectangle obj = new Rectangle(-6,-4);
        int expectedArea = 24;
        int actualArea = obj.area();
        assertEquals(expectedArea, actualArea);
    }
}
