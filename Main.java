package com.company;

import java.util.Random;

public class Main {

    public static int bossHealth = 700;
    public static int bossDamage = 50;
    public static int medicHealth = 900;
    public static int golemHealth = 1500;
    public static int golemDamage = 5;
    public static int luckyHealth = 200;
    public static int luckyDamage = 23;
    public static int berserkHealth = 200;
    public static int berserkDamage = 15;
    public static int thorHealth = 150;
    public static int thorDamage = 10;
    public static String bossDefenceType = "";
    public static int[] heroesHealth = {270, 260, 250, 240};
    public static int[] heroesDamage = {25, 15, 20, 30};
    public static String[] heroesAttackType = {"Physical", "Magical", "Kinetic", "Archer"};
    public static int roundCounter = 0;

    public static void main(String[] args) {
        printStatistics();
        while (!isGameOver()) {
            round();
        }
    }

    public static void round() {
        if (bossHealth > 0) {
            changeDefenceType();
            bossHits();
        }
        heroesHit();
        printStatistics();
    }

    public static void changeDefenceType() {
        Random random = new Random();
        int randomIndex = random.nextInt(heroesAttackType.length);
        bossDefenceType = heroesAttackType[randomIndex];
        System.out.println("Boss choose: " + bossDefenceType);
    }

    public static void printStatistics() {
        System.out.println("_________________________");
        System.out.println("Round: " + roundCounter);
        roundCounter++;
        System.out.println("Boss' health: " + bossHealth);
        System.out.println("Golem' health: " + golemHealth);
        System.out.println("Lucky's health: " + luckyHealth);
        System.out.println("Berserk' health: " + berserkHealth);
        System.out.println("Thor's health: " + thorHealth);

        int min = heroesHealth[0];
        for (int array : heroesHealth){
            if (array < min){
                min = array;
                if (array > 0 && array < 100){
                    array = array + 100;
                }
            }
            System.out.println("Heroes health: " + array);
        }
        System.out.println("Medic Health: " + medicHealth);
        System.out.println("_________________________");
    }


    public static void bossHits() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                if (heroesHealth[i] - bossDamage < 0) {
                    heroesHealth[i] = 0;
                } else {
                    heroesHealth[i] = heroesHealth[i] - bossDamage;
                }

                if (golemHealth > 0) {
                    heroesHealth[i] = (int) (heroesHealth[i] - bossDamage * 0.80);
                    if ((int) (golemHealth - bossDamage + (bossDamage * 0.20)) < 0){
                        golemHealth = 0;
                    }else {
                        golemHealth = (int) (golemHealth - bossDamage + (bossDamage * 0.20));
                    }
                }


                if (berserkHealth > 0){
                    if ((berserkHealth - bossDamage) < 0){
                    berserkHealth = 0;
                    }else {
                        berserkHealth = (int) (berserkHealth - bossDamage * 0.70);
                    }
                }

                if (medicHealth > 0) {
                    if (medicHealth - bossDamage < 0) {
                        medicHealth = 0;
                    } else {
                        medicHealth = medicHealth - bossDamage;
                    }
                }
            }
        }
    }

    public static void heroesHit() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0 && bossHealth > 0) {
                if (heroesAttackType[i] == bossDefenceType) {
                    Random random = new Random();
                    int randomValue = random.nextInt(10);
                    heroesDamage[i] = heroesDamage[i] - randomValue;
                } else {
                    bossHealth = bossHealth - heroesDamage[i];
                }
                if (bossHealth - heroesDamage[i] < 0) {
                    bossHealth = 0;
                } else {
                    bossHealth = bossHealth - heroesDamage[i];
                }
                if (golemHealth > 0){
                    if (bossHealth - golemDamage < 0){
                        bossHealth = 0;
                    }else {
                        bossHealth = bossHealth - golemDamage;
                    }
                }
                if (berserkHealth > 0){
                    berserkDamage = (int) (bossDamage * 0.30 + berserkDamage);
                    if (bossHealth - berserkDamage > 0){
                        bossHealth = 0;
                    }else {
                    bossHealth = bossHealth - berserkDamage;
                    }
                }
            }
        }
    }

    public static boolean isGameOver() {
        boolean bossDead = false;
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            bossDead = true;
            return bossDead;
        }

        boolean allHeroesDead = true;
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
            return allHeroesDead;
        }
        return allHeroesDead;
    }
}
