package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LengthBetweenPointsTest {

    @Test
    public void testLength() {
        Point point = new Point(5,10);
        Assert.assertEquals(point.lenghtBetweenPoints(), 5);
        Point point2 = new Point(10,10);
        Assert.assertEquals(point2.lenghtBetweenPoints(), 0);
        Point point3 = new Point(4,10);
        Assert.assertEquals(point3.lenghtBetweenPoints(), 0);
    }
}
