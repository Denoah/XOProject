package el.denoah.model;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void testGetSize() throws Exception {
        Field field = new Field();

        final int fieldSize = 3;

        assertEquals(fieldSize, field.getSize());
    }

    @Test
    public void testSetFigure() throws Exception {
        Field field = new Field();

        Figure figure = Figure.O;

        Point point = new Point(2,2);

        field.setFigure(point, figure);

        assertEquals(field.getFigure(point), figure);
    }
}