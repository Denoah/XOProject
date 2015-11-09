package el.denoah.model;

import static org.junit.Assert.*;


public class PlayerTest {



    @org.junit.Test
    public void testGetName() throws Exception {

        final String testValue = "Slava";
        final String expectedValue = "Slava";

        final Player player = new Player(testValue, null);

        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);
    }

    @org.junit.Test
    public void testGetFigure() throws Exception {

        final Figure testFigure = Figure.O;
        final Figure expectedFigure = Figure.O;

        final Player player = new Player(null, testFigure);

        Figure actualFigure = player.getFigure();

        assertEquals(expectedFigure, actualFigure);


    }
}