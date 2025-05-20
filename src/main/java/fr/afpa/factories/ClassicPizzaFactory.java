package fr.afpa.factories;

import fr.afpa.core.Pizza;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import fr.afpa.models.MargheritaPizza;
import fr.afpa.models.PepperoniPizza;
import fr.afpa.models.VgPizza;
import fr.afpa.models.AnanasPizza;


public class ClassicPizzaFactory {

    // final pour toujours pointer vers cette map meme si on enleve ou rajoute des éléments
    //Supplier : Interface Java qui ne prends rien en entrée et retourne un objet de type T
    private final Map<String, Supplier<Pizza>> registry = new HashMap<>();

    public ClassicPizzaFactory() {
        registry.put("margherita", MargheritaPizza::new);
        registry.put("pepperoni", PepperoniPizza::new);
        registry.put("vg", VgPizza::new);
        registry.put("ananas", AnanasPizza::new);
        // Pour ajouter une nouvelle pizza on a juste a rajouter une ligne ici
    }

    public Pizza createPizza(String type) {
        Supplier<Pizza> supplier = registry.get(type.toLowerCase());
        if (supplier != null)
            return supplier.get();
        throw new IllegalArgumentException("Type de pizza inconnu !");
    }
}

