/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensehat;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Class containing informations collected with Sense Hat
 *
 * @author root
 */
@ManagedBean(name = "sensehat", eager = true)
@RequestScoped
public class SenseHat {

    /* Temperature */
    private long temperature;
    /* Pressure */
    private long pressure;
    /* Humidity */
    private long humidity;
    
    public long getTemperature() {
        return temperature;
    }

    public void setTemperature(long temperature) {
        this.temperature = temperature;
    }

    public long getPressure() {
        return pressure;
    }

    public void setPressure(long pressure) {
        this.pressure = pressure;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

}
