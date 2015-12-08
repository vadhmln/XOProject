package controller;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import model.Field;
import model.Figure;
import model.Point;
import model.exceptions.InvalidMoveException;

@objid ("2304a30f-7a65-4820-b888-e5410af2337f")
public class WinnerController {
    @objid ("e33ad546-0561-449d-bcbe-2fd2087c6e3b")
    public Figure getWinner(final Field field) throws InvalidMoveException {
        try {
        //            if (field.getFigure(new Point(0, 0)) == field.getFigure(new Point(0, 1)) &&
        //                    field.getFigure(new Point(0, 0)) == field.getFigure(new Point(0, 2))) {
        //                return field.getFigure(new Point(0, 0));
        //            }
        //            if (field.getFigure(new Point(1, 0)) == field.getFigure(new Point(1, 1)) &&
        //                    field.getFigure(new Point(1, 0)) == field.getFigure(new Point(1, 2))) {
        //                return field.getFigure(new Point(1, 0));
        //            }
        //            if (field.getFigure(new Point(2, 0)) == field.getFigure(new Point(2, 1)) &&
        //                    field.getFigure(new Point(2, 0)) == field.getFigure(new Point(2, 2))) {
        //                return field.getFigure(new Point(2, 0));
        //            }
            for (int i = 0; i < 3; i++) {
                if (check(field, new Point(i, 0), new Point(i, 1), new Point(i, 2))) {
                    return field.getFigure(new Point(i, 0));
                }
            }
            for (int i = 0; i < 3; i++) {
                if (check(field, new Point(0, i), new Point(1, i), new Point(2, i))) {
                    return field.getFigure(new Point(0, i));
                }
            }
            if (check(field, new Point(0, 0), new Point(1, 1), new Point(2, 2))) {
                return field.getFigure(new Point(0, 0));
            }
            if (check(field, new Point(0, 2), new Point(1, 1), new Point(2, 0))) {
                return field.getFigure(new Point(1, 1));
            }
        
        } catch (InvalidMoveException e) {
            e.printStackTrace();
        }
        return null;
    }

    @objid ("21a88967-38f9-43c1-aa32-da35a7a86c3b")
    private boolean check(final Field field, final Point startPoint, final IPointChanger pointChanger) {
        final Point p1 = startPoint;
        final Point p2 = pointChanger.next(p1);
        final Point p3 = pointChanger.next(p2);
        
        try {
            if (field.getFigure(p1) == null) {
                return false;
            }
            if (field.getFigure(p1) == field.getFigure(p2) && field.getFigure(p1) == field.getFigure(p3)) {
                return true;
            }
        } catch (InvalidMoveException e) {
            e.printStackTrace();
        }
        return false;
    }

    @objid ("523f1aad-aaae-451c-8184-39aa187646b5")
    private interface IPointChanger {
        @objid ("cd4c06d2-4990-49bf-b8aa-0e65513fa8b8")
        Point next(final Point point);

    }

}
