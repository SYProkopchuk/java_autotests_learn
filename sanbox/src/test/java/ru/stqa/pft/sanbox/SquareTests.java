package ru.stqa.pft.sanbox;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square (5);
        assert s.area() == 25;
    }
}
