package Entities;

public class Stage {
    private int id;
    private String name;

    public Stage(int id, String name) throws Exception {
        setId(id);
        setName(name);
    }

    public Stage() {
        id=0;
        name = "Pre-Boss";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) throws Exception {
        if (id < 0) {
            throw new Exception("Entities/Stage: Invalid id");
        }
        else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) throws Exception {
        if (name == null) {
            throw new Exception("Entities/Stage: Invalid name");
        }
        else {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return id + "(" + name + ")";
    }
}
