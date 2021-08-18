import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SquareTest {
    @Test
    void toFindAreaOfSquareWithPositiveSides()
    {
        Square obj = new Square(6);
        int expectedArea = 36;
        int actualArea = obj.area();
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void toFindAreaOfSquareWithNegativeSides()
    {
        Square obj = new Square(-6);
        int expectedArea = 36;
        int actualArea = obj.area();
        assertEquals(expectedArea, actualArea);
    }
}
