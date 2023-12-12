import java.util.ArrayList;
import java.util.List;

class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    // Getters for all fields

    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(name);
        values.add(Integer.toString(hitPoints));
        values.add(Integer.toString(strength));
        return values;
    }

    public void read(List<String> values) {
        if (values != null && !values.isEmpty()) {
            name = values.get(0);
            hitPoints = Integer.parseInt(values.get(1));
            strength = Integer.parseInt(values.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + "}";
    }
}