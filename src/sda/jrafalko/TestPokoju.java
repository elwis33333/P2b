package sda.jrafalko;

import house.Room;

public class TestPokoju {
    public static void main(String[] args) {

        Room pokojGoscinny = new Room(2.5, 4, 6);
        System.out.println(pokojGoscinny);

        System.out.print("Powierzchnia ścian: ");
        System.out.println(pokojGoscinny.getWalsArea() + " m2");

        Room kuchnia = new Room();
        Room lazienka = new Room(2.3, 2, 3);

        Room[] dziwnyDom = new Room[4];
        dziwnyDom[0] = pokojGoscinny;
        dziwnyDom[1] = kuchnia;
        dziwnyDom[2] = lazienka;
        dziwnyDom[3] = new Room(6, 100, 150);

        System.out.println("Dziwny Dom:");
        for (Room r : dziwnyDom) {
            System.out.println(r);
        }

        System.out.println(kuchnia.getClass().getName());

    }
}