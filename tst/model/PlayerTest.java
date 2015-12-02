package model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Админ on 02.12.2015.
 */
public class PlayerTest {

    @Test
    public void testGetName() throws Exception {
        final String inputValue = "Name";
        final String expectedValue = inputValue; // "1234" - test fault
        final Player player = new Player(expectedValue, null);
        final String actualValue = player.getName();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFigure() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue; // "1234" - test fault
        final Player player = new Player(null, inputValue);
        final Figure actualValue = player.getFigure();
        assertEquals(expectedValue, actualValue);
    }
}