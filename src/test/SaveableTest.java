import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class SaveableTest {

    @Test
    public void testPlayerReadWrite() {

        Player player = new Player("Tim", 10, 15);
        List<String> playerData = player.write();
        Player newPlayer = new Player("", 0, 0);
        newPlayer.read(playerData);
        assertEquals(player, newPlayer);
    }

    @Test
    public void testMonsterReadWrite() {

        Monster monster = new Monster("Dragon", 50, 30);
        List<String> monsterData = monster.write();
        Monster newMonster = new Monster("", 0, 0);
        newMonster.read(monsterData);
        assertEquals(monster, newMonster);
    }
}
