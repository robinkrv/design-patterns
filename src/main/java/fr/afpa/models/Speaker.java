package fr.afpa.models;

public class Speaker {
    /**
     * Connecte les hauts-parleur au système de son principal
     */
    public void connect() {
        System.out.println("Speaker connected");
    }

    /**
     * Emet le signal audio
     */
    public void outputSound() {
        System.out.println("Sound outputting...");
    }
}
