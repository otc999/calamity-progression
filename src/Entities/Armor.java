package Entities;

import Enum.DamageType;

public class Armor extends Item {
    private int armor;
    private DamageType damageType;


    public Armor(String name, Craft craft, int armor, DamageType damageType) throws Exception {
        super(name, craft);
        setArmor(armor);
        setDamageType(damageType);
    }

    public Armor(String name, Entity from, int armor, DamageType damageType) throws Exception {
        super(name, from);
        setArmor(armor);
        setDamageType(damageType);
    }

    public Armor(String name, Craft craft, Entity from, int armor, DamageType damageType) throws Exception {
        super(name, craft, from);
        setArmor(armor);
        setDamageType(damageType);
    }

    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) throws Exception {
        if (armor < 0) {
            throw new Exception("Entities/Armor: Invalid armor");
        }
        else {
            this.armor = armor;
        }
    }

    public DamageType getDamageType() {
        return damageType;
    }
    public void setDamageType(DamageType damageType) throws Exception {
        if (damageType == null) {
            throw new Exception("Entities/Armor: Invalid damage type");
        }
        else {
            this.damageType = damageType;
        }
    }
}
