import Entities.*;
import Enum.DamageType;

void main() throws Exception {
    Stage stage1 = new Stage (3, "Pre First Mech");
    Material material1 = new Material("Forbidden Fragment", stage1);

    Stage stage2 = new Stage(7, "Pre Third Mech");
    Material material2 = new Material("Adamantite Bar", stage2);

    Craft craft1 = new Craft(List.of(material1, material2));
    Weapon weapon1 = new Weapon("Forsaken Saber", craft1, 80, DamageType.Melee);

    Stage stage3 = new Stage(20, "EndGame");
    Material material3 = new Material("Shadowspec Bar", stage3);

    Craft craft2 = new Craft(List.of(weapon1, material3));
    Weapon weapon2 = new Weapon("Red Sun", craft2, 350, DamageType.Melee);

    System.out.println(weapon2);

}