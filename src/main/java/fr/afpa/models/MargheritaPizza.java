package fr.afpa.models;

import fr.afpa.core.Pizza;

public class MargheritaPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Tomates, mozza', basilic. Que demander de plus ?");
    }
}
