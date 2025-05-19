package fr.afpa.core;

import java.util.HashMap;
import java.util.Objects;

public class PasswordVault {

    //Première instance null pour le lazy loading
    private static PasswordVault instance = null;

    private HashMap<String, String> passwords;

    private PasswordVault() {
        passwords = new HashMap<>();
    }

    //La méthode d'accès doit être statique !
    public static PasswordVault getInstance() {
        if (instance == null) {
            instance = new PasswordVault();
        }
        return instance;
    }


    public void addPassword(String service, String password) {
        passwords.put(service, password);
    }

    public String getPassword(String service) {
        return passwords.get(service);
    }
}

