package org.example.creator;

import org.example.products.BigUFOShip;
import org.example.products.RocketShip;
import org.example.products.Ship;
import org.example.products.UFOShip;

public class ShipFactory {
    public Ship makeEnemyShip(String newShipType){
        Ship newShip = null;

        if(newShipType.equals("U")){
            return new UFOShip();
        } else if (newShipType.equals("R")) {
            return new RocketShip();
        } else if (newShipType.equals("B")){
            return  new BigUFOShip();
        } else return null;
    }
}

