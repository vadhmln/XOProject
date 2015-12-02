package model;


public class Player {
    private final String name;

    private final Figure figure;

    public Player(final String name, final Figure figure) {
        this.name = name;
        this.figure = figure; // if put null we'll get errors in tests
    }

    public String getName() {
        // TODO Auto-generated return
        return name;
    }

    public Figure getFigure() {
        return figure;
    }

}
