package com.company;

public class GameEntity extends Weapon{
    private int health, damage;
    private String superPower;

    public GameEntity(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getInfo(){
        return "Health: " + getHealth() + ", Damage: " + getDamage() + ", Super power: " + getSuperPower();
    }
}
