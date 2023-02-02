package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test script for Task 2 to test if isAlive() is working.
 */
public class PlayerTest {
    /**
     *
     */
    @Test
    void testIsAlive() {
        PacManSprites testPacman = new PacManSprites();
        PlayerFactory testFactory = new PlayerFactory(testPacman);
        Player pacTest = testFactory.createPacMan();

        assertThat(pacTest.isAlive()).isEqualTo(true);
    }
}
