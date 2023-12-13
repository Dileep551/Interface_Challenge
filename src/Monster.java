import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }


    public int getHitPoints() {
        return hitPoints;
    }


    public int getStrength() {
        return strength;
    }


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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monster monster = (Monster) obj;
        return hitPoints == monster.hitPoints &&
                strength == monster.strength &&
                Objects.equals(name, monster.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hitPoints, strength);
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + "}";
    }
}