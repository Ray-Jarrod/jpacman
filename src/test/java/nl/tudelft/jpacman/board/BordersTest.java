package nl.tudelft.jpacman.board;

import nl.tudelft.jpacman.level.Level;
import nl.tudelft.jpacman.level.LevelFactory;
import nl.tudelft.jpacman.level.MapParser;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.points.DefaultPointCalculator;
import nl.tudelft.jpacman.points.PointCalculator;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BordersTest {
    /**
     * A test that determines if withinBorders() is functioning properly
     */
    @Test
    void inBorderTest() {
        PacManSprites PacSprites = new PacManSprites();
        GhostFactory testGhosts = new GhostFactory(PacSprites);
        BoardFactory testFactory = new BoardFactory(PacSprites);
        PointCalculator testCalc = new DefaultPointCalculator();
        LevelFactory testLevel = new LevelFactory(PacSprites, testGhosts, testCalc);
        MapParser testMapParser = new MapParser(testLevel, testFactory);

        /**
         * Creates test board that looks like
         * ###
         * #.#
         * ###
         */
        Level parsedLevel = testMapParser.parseMap(Lists.newArrayList("###","#.#","###"));
        Board testBoard = parsedLevel.getBoard();

        assertThat(testBoard.withinBorders(1,1));
    }
}
