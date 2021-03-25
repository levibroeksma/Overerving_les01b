package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.ApolloRocket;
import nl.novi.javaprogrammeren.overerving.Rocket;

import static nl.novi.javaprogrammeren.overerving.ApolloRocket.*;

public class Main {
    /*
    Bekijk onderstaande code. Er zijn twee klasse, twee objecten.
    ApolloRocket extends Rocket.

    De ApolloRocket is speciaal. Wanneer deze geïnstantieerd wordt, moeten we ook het aantal motoren meegeven. Pas de
    constructor aan.

    Maak vervolgens in deze klasse een ApolloRocket object aan en roep de toString()-methode aan.
     */

    public static void main(String[] args) {
        Rocket genericRocket = new Rocket(100);

        genericRocket.fly(10);
        System.out.println(genericRocket.toString());


        ApolloRocket ar = new ApolloRocket(100, 20);
        ar.fly(10);
        System.out.println(ar);
    }
}
