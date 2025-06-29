package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Lab5Tests {

	// Tests for Rectangle.java
	
	@Test
	public void testIsSquareTrue() {
		Point A = new Point(0,0);
		Point B = new Point(0,4);
		Point C = new Point(4,4);
		Point D = new Point(4,0);
		Rectangle r1 = new Rectangle(A,B,C,D);
		assertTrue(r1.isSquare());
	}
	
	@Test
	public void testNotSquare() {
		Point A = new Point(0,0);
		Point B = new Point(0,3);
		Point C = new Point(4,0);
		Point D = new Point(4,3);
		Rectangle r2 = new Rectangle(A,B,C,D);
		assertFalse(r2.isSquare());
	}
	
	@Test
	public void testNotRectangle() {
		Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(3, 2);
        Point D = new Point(2, 0);
        Rectangle r3 = new Rectangle(A, B, C, D);
        assertFalse(r3.isSquare());
	}
	
	@Test
	public void testPerimeter() {
		Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(3, 2);
        Point D = new Point(3, 0);
        Rectangle r4 = new Rectangle(A, B, C, D);
        double expected = 2 + 3 + 2 + 3; // = 10
        assertEquals(expected, r4.perimeter(), 0.0001);
	}
	
	@Test
	public void testArea() {
		Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(3, 2);
        Point D = new Point(3, 0);
        Rectangle r5 = new Rectangle(A, B, C, D);
        double expected = 2 * 3;
        assertEquals(expected, r5.area(), 0.0001);
	}
	
	@Test
	public void testZeroArea() {
		Point A = new Point(0, 0);
        Point B = new Point(0, 0);
        Point C = new Point(0, 0);
        Point D = new Point(0, 0);
        Rectangle r6 = new Rectangle(A, B, C, D);
        assertEquals(0, r6.area(), 0.0001);
        assertEquals(0, r6.perimeter(), 0.0001);
        assertTrue(r6.isSquare());  
        // All sides 0, still satisfies isSquare condition.
	}
	
	// Tests for Point.java
	
	@Test
    public void testDistanceToSelf() {
        Point p = new Point(1, 1);
        assertEquals(0.0, p.distance(p), 0.0001);
    }
	
	@Test
    public void testDistanceToOtherPoint() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4); // Expect to return 5.0
        assertEquals(5.0, p1.distance(p2), 0.0001);
    }
	
	@Test
    public void testEqualsSameObject() {
        Point p = new Point(2, 3);
        assertTrue(p.equals(p));
    }
	
	@Test
    public void testEqualsSameValues() {
        Point p1 = new Point(5, 6);
        Point p2 = new Point(5, 6);
        assertTrue(p1.equals(p2));
    }
	
	@Test
    public void testNotEqualsDifferentValues_x() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 2);
        assertFalse(p1.equals(p2));
    }
	
	@Test
    public void testNotEqualsDifferentValues_y() {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(2, 1);
        assertFalse(p1.equals(p2));
    }
	
	@Test
    public void testNotEqualsNull() {
        Point p = new Point(1, 1);
        assertFalse(p.equals(null));
    }
	
	@Test
    public void testNotEqualsDifferentClass() {
        Point p = new Point(0, 0);
        String s = "Point";
        assertFalse(p.equals(s));
    }
	
	@Test
    public void testHashCodeConsistency() {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(3, 5);
        assertEquals(p1.hashCode(), p2.hashCode());
    }
	
	@Test
    public void testHashCodeDifference() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 1);
        assertNotEquals(p1.hashCode(), p2.hashCode());
    }
}
