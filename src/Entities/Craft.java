package Entities;

import java.util.List;

public class Craft {
    private List<Material> materials;

    public Craft(List<Material> materials) throws Exception {
        setMaterials(materials);
    }

    public List<Material> getMaterials() {
        return materials;
    }
    public void setMaterials(List<Material> materials) throws Exception {
        if (materials == null) {
            throw new Exception("Entities/Craft: Invalid material list");
        }
        else {
            this.materials = materials;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Craft from\n");
        for (Material material : materials) {
            builder.append("    ")
                    .append(material.toString())
                    .append("\n");
        }
        return builder.toString();
    }
}
