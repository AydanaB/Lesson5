package com.company;

public class Boss extends GameEntity{
    private String weaponType,weaponName;

    public Boss(int health, int damage, String superPower, String weaponName, String weaponType) {
        super(health, damage, superPower);
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }

    @Override
    public String getInfo() {
        System.out.println("Weapon type: " + weaponType + ", Weapon name: " + weaponName);
        return super.getInfo();
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
