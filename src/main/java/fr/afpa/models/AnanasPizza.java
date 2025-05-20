package fr.afpa.models;

import fr.afpa.core.Pizza;

public class AnanasPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Qui mange ca svp ?");
    }
}

