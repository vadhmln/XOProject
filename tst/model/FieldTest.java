package model;

import model.exceptions.AlreadyOccupiedException;
import model.exceptions.InvalidMoveException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ����� on 03.12.2015.
 */
public class FieldTest {

    @Test
    public void testGetSize() throws Exception {
        final Field field = new Field();
        assertEquals(3, field.getSize());
    }

    @Test
    public void testSetFigure() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;

        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure, actualFigure);
    }

//    @Test
//    public void testSetFigureWhenAlreadyOccupied() throws Exception {
//        final Field field = new Field();
//        final Point inputPoint = new Point(0, 0);
//        final Figure inputFigure = Figure.O;
//
//        field.setFigure(inputPoint, inputFigure);
//        try {
//            field.setFigure(inputPoint, inputFigure);
//            fail();
//        } catch (final AlreadyOccupiedException e) {
//
//        }
//    }

    @Test
    public void testFigureWhenFigureIsNotSet() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertNull(actualFigure);
    }

    @Test
    public void testFigureWhenXLessZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(-1, 0);
        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidMoveException e) {

        }
    }

    @Test
    public void testFigureWhenYLessZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, -1);
        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidMoveException e) {

        }
    }

    @Test
    public void testFigureWhenXMoreZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(field.getSize() + 1, 0);
        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidMoveException e) {

        }
    }

    @Test
    public void testFigureWhenYMoreZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, field.getSize() + 1);
        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidMoveException e) {

        }
    }
}