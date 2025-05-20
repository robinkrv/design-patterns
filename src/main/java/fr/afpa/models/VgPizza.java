package fr.afpa.models;

import fr.afpa.core.Pizza;

public class VgPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Sauce tomate, mozzarella, poivrons, champignons, oignons.");
    }
}
