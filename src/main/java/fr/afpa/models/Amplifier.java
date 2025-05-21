package fr.afpa.models;

public class Amplifier {
    /**
     * Démarre l'amplificateur
     */
    public void turnOn() {
        System.out.println("Amplifier on");
    }

    /**
     * Règle le volume de l'amplificateur
     * Volume min : 1
     * Volume max : 10
     */
    public void setVolume(int level) {
        System.out.println("Setting volume to: " + level);
    }
}