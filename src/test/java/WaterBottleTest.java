import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void setUp() { waterbottle = new WaterBottle(100);}

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrink(){
        assertEquals(90, waterbottle.drinkWater());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, waterbottle.emptyBottle());
    }

    @Test
    public void canFill(){
        WaterBottle emptyBottle = new WaterBottle(0);
        assertEquals(100, emptyBottle.fillBottle());
    }
}
