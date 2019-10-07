package com.joshua;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testVehicleImpl
{
    private VehicleInterface hatchback, coach;
    @Before
    public void service()
    {
        ApplicationContext jZ = new AnnotationConfigApplicationContext(AppConfig.class);
        hatchback = (VehicleInterface) jZ.getBean("Vw Golf");
        coach = (VehicleInterface) jZ.getBean("GAB");

    }
@Test
    public void testCar() throws Exception
    {
        int result=2;

        hatchback.changeGears(result);
        hatchback.speedUp(5);
        hatchback.applyBrakes(3);
        assertEquals(2, result);
    }
    @Test
    public void testBus() throws Exception
    {
        int result=2;

        hatchback.changeGears(result);
        coach.speedUp(5);
        hatchback.applyBrakes(3);
        assertEquals(2, result);
    }

}