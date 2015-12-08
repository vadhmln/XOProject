package model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6a73ef1a-db2b-48f5-a80d-4b7254323ece")
public class Game {
    @objid ("8445df0a-3887-4141-82ac-08a25ea9d1c7")
    private final String name;

    @objid ("05fe90ef-1c7c-4cc7-ac24-b783c8641c2b")
    private final Player[] players;

    @objid ("1de6350e-1859-46c5-88d1-c032eb5d3b1d")
    private final Field field;

    @objid ("e7c59801-04ad-43b4-91ea-ef90e8077771")
    public Game(final Player[] players, final Field field, final String name) {
        this.players = players;
        this.field = field;
        this.name = name;
    }

    @objid ("d2909a96-6b6a-4a89-ba6a-e0661c07af79")
    public Player[] getPlayers() {
        return players;
    }

    @objid ("7aa4d37a-11c4-4f82-b4f8-7498c73ed561")
    public Field getField() {
        return field;
    }

    @objid ("f9b5239a-68e8-40b4-b2e4-8195ee5341aa")
    public String getName() {
        return name;
    }

}
