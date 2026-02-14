package Entities;

public class Acessory extends Item {

    public Acessory(String name, Craft craft) throws Exception {
        super(name, craft);
    }

    public Acessory(String name, Entity from) throws Exception {
        super(name, from);
    }

    public Acessory(String name, Craft craft, Entity from) throws Exception {
        super(name, craft, from);
    }
}
