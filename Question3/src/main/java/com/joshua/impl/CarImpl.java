package com.joshua.impl;

import com.joshua.VehicleInterface;

public class CarImpl implements VehicleInterface{
    int gear;
    int speed;

    @Override
    public int changeGears(int g) {
        // TODO Auto-generated method stub
        return gear = g;
    }

    @Override
    public int speedUp(int s) {
        // TODO Auto-generated method stub
        return speed = speed + s;
    }

    @Override
    public int applyBrakes(int b) {
        // TODO Auto-generated method stub
        return speed = speed - b;
    }
}