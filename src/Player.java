import java.util.ArrayList;
import java.util.List;

class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }


    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(name);
        values.add(Integer.toString(hitPoints));
        values.add(Integer.toString(strength));
        values.add(weapon);
        return values;
    }

    public void read(List<String> values) {
        if (values != null && !values.isEmpty()) {
            name = values.get(0);
            hitPoints = Integer.parseInt(values.get(1));
            strength = Integer.parseInt(values.get(2));
            weapon = values.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + ", weapon='" + weapon + "'}";
    }
}
