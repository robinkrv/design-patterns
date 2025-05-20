package fr.afpa.models;

import fr.afpa.core.Pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Sauce tomate, mozzarella, pepperoni, olives.");
    }
}

