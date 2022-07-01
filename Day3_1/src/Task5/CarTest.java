package Task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;
    @BeforeEach
    public void setUp() {
        car = new Car();
    }
    @Test
    @DisplayName("Should increase speed")
    void increaseSpeed() {
        car.changeGear(1);
        car.increaseSpeed(15);
        assertEquals(15, car.getSpeed());
    }
    @Test
    @DisplayName("Speed for first gear should not be more than 20")
    void increaseSpeed2() {
        car.changeGear(1);
        car.increaseSpeed(600);
        assertEquals(20, car.getSpeed());
    }

    @Test
    @DisplayName("Should not decrease to negative value")
    void decreaseSpeed() {
        car.changeGear(1);
        car.increaseSpeed(20);
        car.decreaseSpeed(5000);
        assertEquals(0, car.getSpeed());

    }

    //private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp2() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    @DisplayName("New car object has to be still.")
    void handlingInNewObject() {
        car.handling();
        assertEquals("Vehicle does not move", outputStreamCaptor.toString().trim());
    }
    @Test
    void handlingInFirstGear(){
        car.changeGear(1);
        car.handling();
        assertEquals("Easy to handle.", outputStreamCaptor.toString().trim());
    }
//    @AfterEach
//    public void tearDown() {
//        System.setOut(standardOut);
//    }

    @Test
    @DisplayName("Can't change gear to 5 with 10 speed.")
    void changeGear() {
        car.changeGear(1);
        car.increaseSpeed(10);
        car.changeGear(5);
        assertEquals("Impossible to change gear. Recommended gear: 1", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("New car object should be on neutral (0 gear).")
    void getGear() {
        assertEquals(0, car.getGear());
    }

    @Test
    @DisplayName("Possible to change gear limit with constructor.")
    void constuctor(){
        car = new Car(220, -60, 6);
        assertEquals(6, car.getGEAR_LIMIT());
    }

}