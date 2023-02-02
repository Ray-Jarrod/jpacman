package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.points.DefaultPointCalculator;
import nl.tudelft.jpacman.points.PointCalculator;
import nl.tudelft.jpacman.sprite.PacManSprites;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PelletTest {
    /**
     *  Creates all objects needed to test if createPellet() is functioning
     */
    @Test
    void createPelletTest() {
        PacManSprites testPacman = new PacManSprites();
        GhostFactory testGhostFact = new GhostFactory(testPacman);
        PointCalculator testCalc = new DefaultPointCalculator();

        LevelFactory testLevel = new LevelFactory(testPacman, testGhostFact, testCalc);

        assertThat(testLevel.createPellet() != null);
    }
}
