package com.joshua;

import com.joshua.impl.CarImpl;
import com.joshua.impl.BusImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;


@Configuration
public class AppConfig 
{
    @Bean(name = "Vw Golf")
    public VehicleInterface getCar()
    {
        return new CarImpl();
    }
    @Bean(name = "GAB")
    public VehicleInterface getBus()
    {
        return new BusImpl();
    }
}
