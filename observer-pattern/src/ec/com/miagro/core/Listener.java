package ec.com.miagro.core;

import ec.com.miagro.client.IListener;
import ec.com.miagro.client.IStation;

public class Listener implements IListener {

    private String name;

    //Reference to our Station class
    private IStation station;

    public Listener(String name) {
        this.name = name;
    }

    @Override
    public void receiveTransmission() {
        String msg = station.getUpdate(this);
        if (msg == null)
            System.out.println(name + " No new data on this station!");
        else
            System.out.println(name + " Retrieving data: " + msg);

    }

    @Override
    public void setStation(IStation station) {
        this.station = station;
    }
}
