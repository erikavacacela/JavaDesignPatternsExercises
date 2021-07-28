package ec.com.miagro;

import ec.com.miagro.client.IListener;
import ec.com.miagro.core.Listener;
import ec.com.miagro.core.Station;

public class Main {

    public static void main(String[] args) {
        Station station = new Station();

        // create listeners
        IListener erika = new Listener("Erika");
        IListener diana = new Listener("Diana");
        IListener ron = new Listener("Ron");

        // Register them...
        station.suscribe(erika);
        station.suscribe(diana);
        station.suscribe(ron);

        // Attaching listener to station
        erika.setStation(station);
        diana.setStation(station);
        ron.setStation(station);

        //Check for updates
        erika.receiveTransmission();
        diana.receiveTransmission();

        //Provider/ Station ( broadcaster)
        station.emitTransmission("Hello everyone!");

        station.unsuscribe(erika);

        station.emitTransmission("Hello dear listeners!");
    }
}
