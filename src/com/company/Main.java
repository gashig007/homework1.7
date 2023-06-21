package com.company;

public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic();
        medic.setHealPoints(10);
        Hero[] hero = {new Magic(), medic, new Warrior()};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility();
        }

        medic.increaseExperience();
    }
}
