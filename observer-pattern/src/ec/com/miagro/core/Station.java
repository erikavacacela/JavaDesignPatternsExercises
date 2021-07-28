package ec.com.miagro.core;

import ec.com.miagro.client.IListener;
import ec.com.miagro.client.IStation;

import java.util.ArrayList;
import java.util.List;

public class Station implements IStation {

    private String data;
    private List<IListener> listeners;

    public Station() {
        listeners = new ArrayList<>();
    }

    @Override
    public void suscribe(IListener listener) {
        listeners.add(listener);
    }

    @Override
    public void unsuscribe(IListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void transmitterToListeners() {
        for (IListener listener : listeners) {
            listener.receiveTransmission();
        }
    }

    @Override
    public String getUpdate(IListener listener) {
        return data;
    }

    public void emitTransmission(String data) {
        System.out.println("Data emitted to Station : " + data);
        this.data = data;
        transmitterToListeners();
    }
}
