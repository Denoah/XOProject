package el.denoah.controller;

import el.denoah.model.Field;
import el.denoah.model.Figure;
import el.denoah.model.exceptions.InvalidPointException;

import java.awt.*;

public class WinnerController {

    public Figure getWinner(final Field field) {
        try {

            for (int i = 0; i < 3; i++) {
                if (check(field, new Point(i, 0), new IPointChanger() {
                    @Override
                    public Point next(Point p) {
                        return new Point(p.x, p.y + 1);
                    }
                })) {
                    return field.getFigure(new Point(i, 0));
                }
            }

            for (int i = 0; i < 3; i++) {
                if (check(field, new Point(0, i), new IPointChanger() {
                    @Override
                    public Point next(Point p) {
                        return new Point(p.x+1, p.y);
                    }
                })) {
                    return field.getFigure(new Point(0, i));
                }
            }


            if (check(field, new Point(0, 0), new IPointChanger() {
                @Override
                public Point next(Point p) {
                    return new Point(p.x+1, p.y+1);
                }
                })) {
                    return field.getFigure(new Point(0, 0));
                }

            if (check(field, new Point(0, 2), new IPointChanger() {
                @Override
                public Point next(Point p) {
                    return new Point(p.x+1, p.y-1);
                }
            })) {
                return field.getFigure(new Point(1, 1));
            }


        } catch (InvalidPointException e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean check(final Field field, final Point currentPoint, final IPointChanger pointChanger) {
        final Figure currentFigure;
        final Figure nextFigure;
        final Point nextPoint = pointChanger.next(currentPoint);

        try {
            currentFigure = field.getFigure(currentPoint);
            nextFigure = field.getFigure(nextPoint);

            if (currentFigure == null) return false;

        } catch (InvalidPointException e) {
            return true;
        }



        if (currentFigure != nextFigure) {
            return false;
        }

        return check(field, nextPoint, pointChanger);
    }

    private interface IPointChanger {
        Point next(final Point p);
    }

}
