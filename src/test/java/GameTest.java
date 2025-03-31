import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    @Test
    public void gameTest() {
        Game game = new Game();
        assertNotNull(game, "Game is null");
    }
}
