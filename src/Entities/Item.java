package Entities;

public class Item extends Material {
    private String name;
    private Craft craft;
    private Entity from;
    private Stage stage;

    public Item(String name, Craft craft) throws Exception {
        super(name, calculateMaxStage(craft));
        this.craft = craft;
    }

    public Item(String name, Entity from) throws Exception {
        super(name, calculateMaxStage(from));
        this.from = from;
    }

    public Item(String name, Craft craft, Entity from) throws Exception {
        super(name, calculateMaxStage(craft, from));
        this.craft = craft;
        this.from = from;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) throws Exception {
        if (name == null) {
            throw new Exception("Entity/Item: Invalid name");
        }
        else {
            this.name = name;
        }
    }

    public Craft getCraft() {
        return craft;
    }
    public void setCraft(Craft craft) throws Exception {
        if (craft == null) {
            throw new Exception("Entity/Item: Invalid craft");
        }
        else {
            this.craft = craft;
            this.stage = calculateMaxStage(craft);
        }
    }

    private static Stage calculateMaxStage(Craft craft) throws Exception {
        if (craft == null) {
            throw new Exception("Entities/Item: Invalid craft");
        }
        else {
            Stage matStage, maxMatStage = new Stage();
            for (Material material : craft.getMaterials()) {
                matStage = material.getStage();
                if (matStage.getId() > maxMatStage.getId()) {
                    maxMatStage = matStage;
                }
            }
            return maxMatStage;
        }
    }
    private static Stage calculateMaxStage(Entity from) throws Exception {
        if (from == null) {
            throw new Exception("Entities/Item: Invalid from");
        }
        else {
            return from.getStage();
        }
    }

    private static Stage calculateMaxStage(Craft craft, Entity from) throws Exception {
        if (craft == null) {
            throw new Exception("Entities/Item: Invalid craft");
        }
        else if (from == null) {
            throw new Exception("Entities/Item: Invalid from");
        }
        else {
            Stage craftS = calculateMaxStage(craft),
                    fromS = calculateMaxStage(from);
            if (craftS.getId() < fromS.getId()) {
                return craftS;
            }
            else {
                return fromS;
            }
        }
    }

    public Entity getFrom() {
        return from;
    }
    public void setFrom(Entity from) throws Exception {
        if (from == null) {
            throw new Exception("Entity/Item: Invalid Entity");
        }
        else {
            this.from = from;
            stage = from.getStage();
        }
    }

    public Stage getStage() {
        return stage;
    }
    public void setStage(Stage stage) throws Exception {
        if (stage == null) {
            throw new Exception("Entity/Item: Invalid Stage");
        }
        else {
            this.stage = stage;
        }
    }

    @Override
    public String toString() {
        String obtain = craft.toString();
        if (craft == null) {
            obtain = from.toString();
        }
        return '"' + name + '"' +
                "\nhow to obtain: " + obtain +
                "item stage: " + stage.toString();
    }

}
