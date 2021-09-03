package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHeath(700);
        boss.setProtectionType("Magic");
        System.out.println("Boss health: " + boss.getHeath());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss protection: " + boss.getProtectionType());

        createHeroes();
    }

    public static Hero[] createHeroes(){
        Hero hero = new Hero(250,30);
        Hero hero2 = new Hero(200, 25, "Kinetic");
        Hero hero3 = new Hero(300, 10, "Magic");

        Hero[] allheroes = {hero, hero2, hero3};
        return allheroes;

    }
}

