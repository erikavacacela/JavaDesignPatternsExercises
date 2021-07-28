package ec.com.miagro.client;

public interface IStation {

    void suscribe(IListener listener);

    void unsuscribe(IListener listernet);

    void transmitterToListeners();

    String getUpdate(IListener listener);
}
