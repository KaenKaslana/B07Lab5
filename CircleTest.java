import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testArea() {
        Circle c = new Circle(new Point(0, 0), 1.0);
        assertEquals(Math.PI, c.area(), 0.0001);
    }

    @Test
    public void testPerimeter() {
        Circle c = new Circle(new Point(0, 0), 2.0);
        assertEquals(2 * Math.PI * 2.0, c.perimeter(), 0.0001);
    }

    @Test
    public void testContainsIn() {
        Circle c = new Circle(new Point(0, 0), 5.0);
        Point p = new Point(3, 4); // distance = 5
        assertTrue(c.contains(p));
    }

    @Test
    public void testContainsOut() {
        Circle c = new Circle(new Point(0, 0), 5.0);
        Point p = new Point(6, 0); // distance = 6
        assertFalse(c.contains(p));
    }
}
