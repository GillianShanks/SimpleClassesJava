import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle();
    }

    @Test
    public void startsWithVolume100(){
        assertEquals(100.0, bottle.getVolume(), 0.01);
    }

    @Test
    public void drinkRemoves10(){
        bottle.drink();
        assertEquals(90.0, bottle.getVolume(), 0.01);
    }

    @Test
    public void canEmpty(){
        bottle.empty();
        assertEquals(0.0, bottle.getVolume(), 0.01);

    }

    @Test
    public void canFill(){
        bottle.fill();
        assertEquals(100.0, bottle.getVolume(), 0.01);
    }
}
