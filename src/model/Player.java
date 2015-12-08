package model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4f9b3e3c-34e6-4b83-93ab-cf9cb52e42e6")
public class Player {
    @objid ("8c1fed0d-0448-456a-9f81-54bcdb52a85c")
    private final String name;

    @objid ("75f68d2f-7238-4592-a843-3c835ba832db")
    private final Figure figure;

    @objid ("d7cf83dd-4db3-4e78-af13-57bb9b8de193")
    public Player(final String name, final Figure figure) {
        this.name = name;
        this.figure = figure; // if put null we'll get errors in tests
    }

    @objid ("76f72dd3-eaf8-4efb-88ed-b95df083e00b")
    public String getName() {
        // TODO Auto-generated return
        return name;
    }

    @objid ("7fdaf8c5-7bfc-4cd2-bf28-87a5675233e3")
    public Figure getFigure() {
        return figure;
    }

}
