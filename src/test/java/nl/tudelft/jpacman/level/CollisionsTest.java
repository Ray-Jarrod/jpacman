package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.points.DefaultPointCalculator;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CollisionsTest {
    /**
     * Tests to make sure that the collision with Player and Pellet is functioning
     */
    @Test
    void testPelletCollision() {
        PacManSprites testPacman = new PacManSprites();
        PlayerFactory testFactory = new PlayerFactory(testPacman);
        GhostFactory testGhostFact = new GhostFactory(testPacman);
        DefaultPointCalculator testCalc = new DefaultPointCalculator();
        PlayerCollisions testCollision = new PlayerCollisions(testCalc);
        Player pacTest = testFactory.createPacMan();

        LevelFactory testLevel = new LevelFactory(testPacman, testGhostFact, testCalc);

        Pellet testPellet = testLevel.createPellet();

        testCollision.playerVersusPellet(pacTest, testPellet);
        //Makes sure the players score increases to determine the collision worked
        assertThat(pacTest.getScore()).isEqualTo(10);
    }
}
