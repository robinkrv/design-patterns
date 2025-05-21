package fr.afpa.publishers;

import fr.afpa.observers.AlertObserver;

import java.util.ArrayList;
import java.util.List;

public class NO2Sensor implements Sensor {

    private final List<AlertObserver> observers = new ArrayList<>();
    @Override
    public void subscribe(AlertObserver observer) { observers.add(observer); }
    @Override
    public void unsubscribe(AlertObserver observer) { observers.remove(observer); }

    @Override
    public void notifySubscriber(String message) {
        for (AlertObserver observer : observers) {
            observer.update("Alerte NO2 : " + message);
        }
    }

    @Override
    public void simulateDetectionEvent() {
        System.out.println(">> Détection de NO2 !");
        notifySubscriber("Taux dangereux de NO2 !");
    }
}
