import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {
    @Test
    public void TestVolume100() {
        WaterBottle waterbottle = new WaterBottle();
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void TestDrinkTakes10() {
        WaterBottle waterbottle = new WaterBottle();
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void TestDrinkEmptied() {
        WaterBottle waterbottle = new WaterBottle();
        assertEquals(0, waterbottle.empty());
    }
@Test
    public void TestDrinkFilled() {
        WaterBottle waterbottle = new WaterBottle();
        assertEquals(100, waterbottle.fill());
}

}
