package el.denoah.controller;

import el.denoah.model.Field;
import el.denoah.model.Figure;
import el.denoah.model.exceptions.InvalidPointException;
import el.denoah.model.exceptions.PointAlreadyOccupiedException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field, final Point point, final Figure figure) throws PointAlreadyOccupiedException, InvalidPointException {
        if (field.getFigure(point) != null) {
            throw new PointAlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }

}
