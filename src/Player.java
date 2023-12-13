import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player implements ISaveable {
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

    public String getName() {
        return name;
    }


    public int getHitPoints() {
        return hitPoints;
    }


    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Player player = (Player) obj;
        return hitPoints == player.hitPoints &&
                strength == player.strength &&
                Objects.equals(name, player.name) &&
                Objects.equals(weapon, player.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hitPoints, strength, weapon);
    }


    @Override
    public String toString() {
        return "Player{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + ", weapon='" + weapon + "'}";
    }
}
