package fr.afpa;

import fr.afpa.core.PasswordVault;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        PasswordVault vault1 = PasswordVault.getInstance();
        PasswordVault vault2 = PasswordVault.getInstance();


        vault1.addPassword("gmail", "azerty123");
        vault1.addPassword("github", "myGithubPass");


        System.out.println(vault2.getPassword("gmail"));
        System.out.println(vault2.getPassword("github"));

        // Vérification de si les 2 objets viennent de la même instance du singleton via son nom + un hash
        System.out.println("vault1 ID: " + Objects.toIdentityString(vault1));
        System.out.println("vault2 ID: " + Objects.toIdentityString(vault2));

        // Doit afficher deux fois la même instance
    }
}
