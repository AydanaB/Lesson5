package com.company;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroesAttackType;

    public Hero(int heroHealth, int heroDamage, String heroesAttackType){
        this.heroDamage = heroDamage;
        this.heroHealth = heroHealth;
        this.heroesAttackType = heroesAttackType;

    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroesAttackType() {
        return heroesAttackType;
    }

    public Hero(int heroHealth, int heroDamage){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

}
