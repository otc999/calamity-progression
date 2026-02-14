package Entities;

public class Entity {
    private String name;
    private Stage stage;

    public Entity(String name, Stage stage) throws Exception {
        setName(name);
        setStage(stage);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) throws Exception {
        if (name == null) {
            throw new Exception("Entities/Entity: Invalid name");
        }
        else {
            this.name = name;
        }
    }

    public Stage getStage() {
        return stage;
    }
    public void setStage(Stage stage) throws Exception {
        if (stage == null) {
            throw new Exception("Entities/Entity: Invalid stage");
        }
        else {
            this.stage = stage;
        }
    }

    @Override
    public String toString() {
        return "Dropped by " + name + " at stage " + stage.toString() + "\n";
    }
}
