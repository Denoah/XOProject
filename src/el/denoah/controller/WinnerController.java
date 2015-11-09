package el.denoah.controller;

import el.denoah.model.Field;
import el.denoah.model.Figure;
import el.denoah.model.exceptions.InvalidPointException;

import java.awt.*;

public class WinnerController {

    public Figure getWinner(final Field field) {
        try {
            if (field.getFigure(new Point(0,0)) == field.getFigure(new Point(0,1)) &&
                    field.getFigure(new Point(0,0)) == field.getFigure(new Point(0,2))) {
                return field.getFigure(new Point(0,0));
            }

        } catch (InvalidPointException e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean check(final Field field, final Point p1, final Point p2, final Point p3) {
        try {
            if (field.getFigure(p1) == null) {
                return false;
            }
            if (field.getFigure(p1))
        } catch (InvalidPointException e) {
            e.printStackTrace();
        }
    }

}
