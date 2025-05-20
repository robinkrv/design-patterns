package fr.afpa.factories;

import fr.afpa.core.Pizza;

public abstract class PizzaFactory {
    public abstract Pizza createPizza(String type);
}
