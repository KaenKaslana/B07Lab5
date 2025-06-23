package lab4;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class OvalTest {
	
@Test
void CircleTrue() {
	Point c = new Point(2,3);
	Oval oval = new Oval(c, 2,2);
	assertTrue(oval.isCircle());
}
@Test
void CircleFalse() {
	Point c = new Point(2,3);
	Oval oval = new Oval(c, 2,2.01);
	assertFalse(oval.isCircle());
}

@Test
void CircleArea() {
	Point c = new Point(2,3);
	Oval oval = new Oval(c, 2,3);
	assertEquals(oval.Area(), 18.84955592153876);
}

}
