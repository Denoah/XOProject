package el.denoah.model;

import el.denoah.model.exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void testGetSize() throws Exception {
        Field field = new Field(3);

        final int fieldSize = 3;

        assertEquals(fieldSize, field.getSize());
    }

    @Test
    public void testSetFigure() throws Exception {
        Field field = new Field(3);

        Figure figure = Figure.O;

        Point point = new Point(2,2);

        field.setFigure(point, figure);

        assertEquals(field.getFigure(point), figure);
    }

    @Test
    public void testGetFigureWhenFigureIsNotSet() throws Exception {
        Field field = new Field(3);

        Point point = new Point(0,0);

        Figure figure = field.getFigure(point);

        assertNull(figure);
    }

    @Test
    public void testGetFigureWhenXLessThenZero() throws Exception {
        Field field = new Field(3);

        Point point = new Point(-1,0);

        try {
            Figure figure = field.getFigure(point);
            fail();
        } catch (final InvalidPointException e) {

        }
    }

    @Test
    public void testGetFigureWhenYLessThenZero() throws Exception {
        Field field = new Field(3);

        Point point = new Point(0,-1);

        try {
            Figure figure = field.getFigure(point);
            fail();
        } catch (final InvalidPointException e) {

        }
    }

    @Test
    public void testGetFigureWhenXMoreThenSize() throws Exception {
        Field field = new Field(3);

        Point point = new Point(4,0);

        try {
            Figure figure = field.getFigure(point);
            fail();
        } catch (final InvalidPointException e) {

        }
    }

    @Test
    public void testGetFigureWhenYMoreThenSize() throws Exception {
        Field field = new Field(3);

        Point point = new Point(0,5);

        try {
            Figure figure = field.getFigure(point);
            fail();
        } catch (final InvalidPointException e) {

        }
    }

//    @Test
//    public void testSetFigureWhenPointAlreadyOccupied() throws Exception {
//        Field field = new Field();
//
//        Point point = new Point(0,0);
//
//        Figure setFigure = Figure.O;
//
//        field.setFigure(point, setFigure);
//
//        try {
//            field.setFigure(point, setFigure);
//            fail();
//        } catch (final PointAlreadyOccupiedException e) {
//
//        }
//    }

}