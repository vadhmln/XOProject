package model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6a73ef1a-db2b-48f5-a80d-4b7254323ece")
public class Game {
    @objid ("05fe90ef-1c7c-4cc7-ac24-b783c8641c2b")
    private Player[] players;

    @objid ("d2909a96-6b6a-4a89-ba6a-e0661c07af79")
    public Player[] getPlayers() {
        return players;
    }

    @objid ("7aa4d37a-11c4-4f82-b4f8-7498c73ed561")
    public Field getField() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("f9b5239a-68e8-40b4-b2e4-8195ee5341aa")
    public String getName() {
        // TODO Auto-generated return
        return null;
    }

}
