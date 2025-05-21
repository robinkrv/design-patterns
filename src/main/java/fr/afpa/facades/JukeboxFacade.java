package fr.afpa.facades;

import fr.afpa.models.Amplifier;
import fr.afpa.models.AudioPlayer;
import fr.afpa.models.Speaker;

public class JukeboxFacade {
    private final AudioPlayer player;
    private final Amplifier amp;
    private final Speaker speaker;

    public JukeboxFacade() {
        this.player = new AudioPlayer();
        this.amp = new Amplifier();
        this.speaker = new Speaker();
    }

    public void playMusic(String track) {
        amp.turnOn();
        amp.setVolume(5);
        speaker.connect();
        player.load(track);
        player.play();
        speaker.outputSound();
    }
}



