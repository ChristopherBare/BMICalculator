import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BMITest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getFirstName() {
        BMI instance = new BMI("First", "Last", 72.0, 200);
        assertTrue(instance.getFirstName() != null);
        assertEquals(instance.getFirstName(), "First");
    }

    @Test
    public void setFirstName() {
        BMI instance = new BMI("First", "Last", 72.0, 200);
        assertTrue(instance.getFirstName() != null);
        assertEquals(instance.getFirstName(), "First");
        instance.setFirstName("NewFirst");
        assertEquals(instance.getFirstName(), "NewFirst");
    }

    @Test
    public void getLastName() {
        BMI instance = new BMI("First", "Last", 72.0, 200);
        assertTrue(instance.getLastName() != null);
        assertEquals(instance.getLastName(), "Last");
    }

    @Test
    public void setLastName() {
        BMI instance = new BMI("First", "Last", 72.0, 200);
        assertTrue(instance.getLastName() != null);
        assertEquals(instance.getLastName(), "Last");
        instance.setLastName("NewLast");
        assertEquals(instance.getLastName(), "NewLast");
    }

    @Test
    public void getHeight() {
        BMI instance = new BMI("First", "Last", 72.0, 200);
        assertEquals(instance.getHeight(), 72.0, 0.001);
    }

    @Test
    public void setHeight() {
        BMI instance = new BMI("First", "Last", 72.0, 200);
        assertEquals(instance.getHeight(), 72.0, 0.001);
        instance.setHeight(75);
        assertEquals(instance.getHeight(), 75, 0.001);
    }

    @Test
    public void getWeight() {
        BMI instance = new BMI("First", "Last", 72.0, 200);
        assertEquals(instance.getWeight(), 200, 0.001);
    }

    @Test
    public void setWeight() {
        BMI instance = new BMI("First", "Last", 72.0, 200);
        assertEquals(instance.getWeight(), 200, 0.001);
        instance.setWeight(180);
        assertEquals(instance.getWeight(), 180, 0.001);
    }

    @Test
    public void getBMI() {
        double bmi = (200*703)/(Math.pow(72.0, 2));
        BMI instance = new BMI("First", "Last", 72.0, 200);
        assertTrue(instance != null);
        assertEquals(bmi, instance.getBMI(), 0.001);
    }
}