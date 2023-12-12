import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Player player = new Player("Tim", 10, 15);
        System.out.println("Player Object: " + player);


        List<String> playerData = player.write();
        System.out.println("Player Data: " + playerData);


        Player newPlayer = new Player("", 0, 0);
        newPlayer.read(playerData);
        System.out.println("New Player Object: " + newPlayer);


        Monster monster = new Monster("Dragon", 50, 30);
        System.out.println("Monster Object: " + monster);


        List<String> monsterData = monster.write();
        System.out.println("Monster Data: " + monsterData);


        Monster newMonster = new Monster("", 0, 0);
        newMonster.read(monsterData);
        System.out.println("New Monster Object: " + newMonster);
    }
}