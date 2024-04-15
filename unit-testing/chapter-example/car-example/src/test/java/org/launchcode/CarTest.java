package org.launchcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car test_car;

    @BeforeEach
    public void createCarObject()
    {
        test_car = new Car("Toyota", "Prius", 10,50);
    }
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest()
    {
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank()
    {
        //Car test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @AfterEach
    public void testDrivingWithinRange()
    {
        //test_car = new Car("Toyota", "Prius", 10,50);
        test_car.drive(100);
        assertEquals(8, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @AfterEach
    public void testDrivingPastRange()
    {
        //test_car = new Car("Toyota", "Prius", 10,50);
        test_car.drive(1000);
        assertFalse(test_car.getGasTankLevel() > 0);
    }
    //TODO: can't have more gas than tank size, expect an exception

    @AfterEach
    public void testMoreGasThanTankSize()
    {
        //test_car = new Car("Toyota", "Prius", 10,50);
        test_car.drive(1000);
        assertTrue(!(test_car.getGasTankLevel() > 10));
    }
}