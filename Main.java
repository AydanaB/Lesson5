package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero(200, 70, "Magic");

        System.out.println(hero.getHeroHealth());
        System.out.println(hero.getHeroDamage());
        System.out.println(hero.getHeroesAttackType());

        Boss boss = new Boss();

        boss.setBossDamage(90);
        boss.setBossHealth(700);
        boss.setBossDefenseType("Magic");

        System.out.println(boss.getBossDamage());
        System.out.println(boss.getBossHealth());
        System.out.println(boss.getBossDefenseType());

    }
}