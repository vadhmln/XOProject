package model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import model.exceptions.AlreadyOccupiedException;
import model.exceptions.InvalidMoveException;

@objid ("ad465f97-1eb9-450a-9936-e2c7e9fe996b")
public class Field {
    @objid ("97375f97-7e49-4c24-b313-174827963c80")
    public static final int FIELD_SIZE = 3;

    @objid ("1b74dad1-5a8c-4143-a4cd-752ab37ddc42")
    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    @objid ("5a509d2f-b7ac-4473-a9c5-f0085754ac50")
    public static final int MIN_COORDINATE = 0;

    @objid ("7c4a9982-22f5-4344-a489-e2247cce45b9")
    public static final int MAX_COORDINATE = FIELD_SIZE;

    @objid ("76aaa78b-2317-483a-82c2-d7eb1a730faa")
    public int getSize() {
        return FIELD_SIZE;
    }

    @objid ("8da05123-4136-4d55-9e76-ce6b40219d93")
    public Figure getFigure(final Point point) throws InvalidMoveException {
        if (!checkPoint(point)){
            throw new InvalidMoveException();
        }
        return field[point.getX()][point.getY()];
    }

    @objid ("2fbef7c8-8b03-46f0-bffa-2b1395056a91")
    public void setFigure(final Point point, final Figure figure) throws InvalidMoveException {
        if (!checkPoint(point)){
            throw new InvalidMoveException();
        }
        
        field[point.getX()][point.getY()] = figure;
    }

    @objid ("3ab4b5df-80b9-4ce7-b5be-10dae0e339f2")
    private boolean checkPoint(final Point point) {
        return checkCoordinate(point.getX()) && checkCoordinate(point.getY());
    }

    @objid ("8a94297e-5188-4b9d-805d-025c171025b2")
    private boolean checkCoordinate(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < MAX_COORDINATE;
    }

}
