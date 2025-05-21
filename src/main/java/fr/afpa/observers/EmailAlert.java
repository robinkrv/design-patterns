package fr.afpa.observers;

public class EmailAlert implements AlertObserver {
    @Override
    public void update(String message) {
        System.out.println("[EMAIL] " + message + " > Message envoyé par mail !");
    }
}
