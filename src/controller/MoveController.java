package controller;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import model.Field;
import model.Figure;
import model.Player;
import model.Point;
import model.exceptions.AlreadyOccupiedException;
import model.exceptions.InvalidMoveException;

@objid ("6b18a8c3-96f9-49a0-85f5-1fe0ed0e3e4f")
public class MoveController {
    @objid ("fd03d073-648a-4c77-a673-4f9d26521033")
    public void applyFigure(final Field field, final Figure figure, final Point point) throws AlreadyOccupiedException, InvalidMoveException {
        if (field.getFigure(point) != null){
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }

}
