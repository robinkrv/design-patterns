package fr.afpa.publishers;

import fr.afpa.observers.AlertObserver;

import java.util.ArrayList;
import java.util.List;

public class SmokeSensor implements Sensor {

    private final List<AlertObserver> observers = new ArrayList<>();


    @Override
    public void subscribe(AlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(AlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscriber(String message) {
        for (AlertObserver observer : observers) {
            observer.update("Alerte FUMEE : " + message);
        }
    }

    @Override
    public void simulateDetectionEvent() {
        System.out.println(">> Détection de fumée !");
        notifySubscriber("Fumée détectée dans la cuisine !");
    }
}
