package Entities;

import Enum.DamageType;

public class Weapon extends Item {
    private int damage;
    private DamageType damageType;

    public Weapon(String name, Craft craft, int damage, DamageType damageType) throws Exception {
        super(name, craft);
        setDamage(damage);
        setDamageType(damageType);
    }

    public Weapon(String name, Entity from, int damage, DamageType damageType) throws Exception {
        super(name, from);
        setDamage(damage);
        setDamageType(damageType);
    }

    public Weapon(String name, Craft craft, Entity from, int damage, DamageType damageType) throws Exception {
        super(name, craft, from);
        setDamage(damage);
        setDamageType(damageType);
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) throws Exception {
        if (damage < 0) {
            throw new Exception("Entities/Weapon: Invalid damage");
        }
        else {
            this.damage = damage;
        }
    }

    public DamageType getDamageType() {
        return damageType;
    }
    public void setDamageType(DamageType damageType) throws Exception {
        if (damageType == null) {
            throw new Exception("Entities/Weapon: Invalid damage type");
        }
        else {
            this.damageType = damageType;
        }
    }

    @Override
    public String toString() {
        return damageType + "(" + damage + ")" + super.toString();
    }
}
