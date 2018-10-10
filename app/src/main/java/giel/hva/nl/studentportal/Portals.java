package giel.hva.nl.studentportal;

import java.util.ArrayList;

public class Portals {
    private static ArrayList<Portal> portals;

    Portals() {
        if(portals == null){
            portals = new ArrayList<>();
        }
    }

    public static ArrayList<Portal> getPortals() {
        return portals;
    }

    void addPortal(Portal portal) {
        portals.add(portal);
    }
}
