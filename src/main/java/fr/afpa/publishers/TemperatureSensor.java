package fr.afpa.publishers;

import fr.afpa.observers.AlertObserver;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements Sensor {
    private final List<AlertObserver> observers = new ArrayList<>();

    @Override
    public void subscribe(AlertObserver observer) { observers.add(observer); }
    @Override
    public void unsubscribe(AlertObserver observer) { observers.remove(observer); }

    @Override
    public void notifySubscriber(String message) {
        for (AlertObserver observer : observers) {
            observer.update("Alerte TEMP : " + message);
        }
    }

    @Override
    public void simulateDetectionEvent() {
        System.out.println(">> Température critique détectée !");
        notifySubscriber("Température > 60°C !");
    }
}
