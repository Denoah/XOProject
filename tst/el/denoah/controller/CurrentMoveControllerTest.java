package el.denoah.controller;

import el.denoah.model.Field;
import el.denoah.model.Figure;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class CurrentMoveControllerTest {

    @Test
    public void testCurrentMoveX() throws Exception {
        CurrentMoveController currentMoveController = new CurrentMoveController();
        Field field = new Field(3);
        field.setFigure(new Point(0,0), Figure.X);
        field.setFigure(new Point(1,1), Figure.O);
        assertEquals(Figure.X, currentMoveController.currentMove(field));

    }

    @Test
    public void testCurrentMoveO() throws Exception {
        CurrentMoveController currentMoveController = new CurrentMoveController();
        Field field = new Field(3);
        field.setFigure(new Point(0,0), Figure.X);
        field.setFigure(new Point(1,1), Figure.O);
        field.setFigure(new Point(1,2), Figure.O);
        assertEquals(Figure.O, currentMoveController.currentMove(field));

    }

    @Test
    public void testCurrentMoveNull() throws Exception {
        CurrentMoveController currentMoveController = new CurrentMoveController();
        Field field = new Field(3);
        field.setFigure(new Point(0,0), Figure.X);
        field.setFigure(new Point(0,1), Figure.X);
        field.setFigure(new Point(0,2), Figure.X);
        field.setFigure(new Point(1,0), Figure.X);
        field.setFigure(new Point(1,1), Figure.X);
        field.setFigure(new Point(1,2), Figure.X);
        field.setFigure(new Point(2,0), Figure.X);
        field.setFigure(new Point(2,1), Figure.X);
        field.setFigure(new Point(2,2), Figure.O);
        assertNull(currentMoveController.currentMove(field));

    }
}