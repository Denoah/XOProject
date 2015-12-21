package el.denoah.controller;

import el.denoah.model.Field;
import el.denoah.model.Figure;
import el.denoah.model.exceptions.InvalidPointException;

import java.awt.*;

public class CurrentMoveController {
    public Figure currentMove(final Field field) throws InvalidPointException {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            for (int y = 0; y < field.getSize(); y++) {
                try {
                    if (field.getFigure(new Point(y, x)) != null) {
                        countFigure ++;
                    }
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
        }

        if (countFigure == field.getSize() * field.getSize()) return null;

        if (countFigure % 2 == 0) {
            return Figure.X;
        } else {
            return Figure.O;
        }
    }
}
