package Entities;

public class Material {
    private String name;
    private Stage stage;

    public Material(String name, Stage stage) throws Exception {
        setName(name);
        setStage(stage);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) throws Exception {
        if (name == null) {
            throw new Exception("Entities/Material Invalid Name");
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
            throw new Exception("Entities/Material Invalid Stage");
        }
        else {
            this.stage = stage;
        }
    }

    @Override
    public String toString() {
        return name + ", at stage: " + stage.toString();
    }

}
