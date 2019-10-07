package com.joshua;



interface Vehicle{
    public void changeGears(int g);
    public void speedUp(int s);
    public void applyBrakes(int b);
}

class Car implements Vehicle
{
    int gear;
    int speed;

    @Override
    public void changeGears(int g)
    {
        gear = g;
    }

    @Override
    public void speedUp(int s)
    {
        speed = speed + s;
    }

    @Override
    public void applyBrakes(int b)
    {
        speed = speed - b;
    }
    public void print()
    {
        System.out.println("speed = "+speed + "gear = "+gear);
    }

}
class Bus implements Vehicle
{
    int gear;
    int speed;

    @Override
    public void changeGears(int g)
    {
        gear = g;
    }

    @Override
    public void speedUp(int s)
    {
        speed = speed + s;
    }

    @Override
    public void applyBrakes(int b)
    {
        speed = speed - b;
    }
    public void print()
    {
        System.out.println("speed = "+speed + "gear = "+gear);
    }
}


public class vehicle 
{
    public static void main( String[] args )
    {
        Car vwGolf = new Car();
        vwGolf.changeGears(3);
        vwGolf.speedUp(6);
        vwGolf.applyBrakes(2);
        vwGolf.print();
        Bus gAB = new Bus();
        gAB.changeGears(3);
        gAB.speedUp(6);
        gAB.applyBrakes(2);
gAB.print();
    }
}
