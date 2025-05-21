package fr.afpa;

import fr.afpa.core.PasswordVault;
import fr.afpa.core.Pizza;
import fr.afpa.facades.JukeboxFacade;
import fr.afpa.factories.ClassicPizzaFactory;
import fr.afpa.factories.PizzaFactory;
import fr.afpa.observers.AlertObserver;
import fr.afpa.observers.EmailAlert;
import fr.afpa.publishers.Sensor;
import fr.afpa.publishers.SmokeSensor;
import fr.afpa.publishers.TemperatureSensor;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //PasswordVault vault1 = PasswordVault.getInstance();
        //PasswordVault vault2 = PasswordVault.getInstance();


        //vault1.addPassword("gmail", "azerty123");
        //vault1.addPassword("github", "myGithubPass");


        //System.out.println(vault2.getPassword("gmail"));
        //System.out.println(vault2.getPassword("github"));

        // Vérification de si les 2 objets viennent de la même instance du singleton via son nom + un hash
        //System.out.println("vault1 ID: " + Objects.toIdentityString(vault1));
        //System.out.println("vault2 ID: " + Objects.toIdentityString(vault2));

        // Doit afficher deux fois la même instance

        //PizzaFactory factory = new ClassicPizzaFactory();

        //Pizza p1 = factory.createPizza("margherita");
        //p1.prepare();

        //Pizza p2 = factory.createPizza("pepperoni");
        //p2.prepare();

        //Pizza p3 = factory.createPizza("vg");
        //p3.prepare();

        //Pizza p4 = factory.createPizza("ananas");
        //p4.prepare();

        //JukeboxFacade jukeboxFacade = new JukeboxFacade();
        //jukeboxFacade.playMusic("Billie Jean");

        Sensor smokeSensor = new SmokeSensor();
        Sensor tempSensor = new TemperatureSensor();

        // Observers
        AlertObserver email = new EmailAlert();

        // Subscribe
        smokeSensor.subscribe(email);

        // Simulation d'événements :
        smokeSensor.simulateDetectionEvent();
        tempSensor.simulateDetectionEvent();
    }
    }


