package lab6.task2;

import java.util.ArrayList;
import java.util.List;
////Observer pattern (mai mult o incercare a unui observer pattern deoare exista "problema" ca trebuie sa se face listeneri in publiser)
public class Publiser {
    private List<Listener> listeners = new ArrayList<Listener>();
    private Listener listener; //E SENDERUL

    public Publiser(Listener listener) {
        this.listener = listener;
    }

    void addListener(Listener listener) {

        if (!listeners.contains(listener))
            listeners.add(listener);
    }

    ;


    void deleteListener(Listener listener) {
        listeners.remove(listener);
    }

    ;

    void notify(Topics topic, String mesaj) {
        for (Listener listener : listeners) {
            if (listener.getTopics().contains(topic) && listener != this.listener) {
                listener.onNotification(this.listener, topic,mesaj);
            }
        }
    }

    ;
}

