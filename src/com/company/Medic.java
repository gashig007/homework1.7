package com.company;

public class Medic extends Hero {
    private int healPoints;

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность CRITICAL DAMAGE");
    }

    public void increaseExperience() {
        System.out.println("Медик вылечил здоровье на " + healPoints + " %");
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
}
