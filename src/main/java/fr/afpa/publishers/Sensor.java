package fr.afpa.publishers;

import fr.afpa.observers.AlertObserver;

public interface Sensor {

    public void subscribe(AlertObserver observer);
    public void unsubscribe(AlertObserver observer);
    public void notifySubscriber(String message);
    public void simulateDetectionEvent();
}
