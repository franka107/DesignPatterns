package org.example;

import org.example.creator.ShipFactory;
import org.example.products.RocketShip;
import org.example.products.Ship;
import org.example.products.UFOShip;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Ship theEnemy = null;
        Scanner userinput = new Scanner(System.in);
        ShipFactory shipFactory = new ShipFactory();
        String enemyShipOption = "";
        System.out.println("What type of shi? (U/R/B)");
        if(userinput.hasNextLine()){
            enemyShipOption = userinput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(enemyShipOption);
        }

        if(theEnemy != null){
            doStuffEnemy(theEnemy);
        } else {
            System.out.println("Enter a U, R or B next time");
        }
    }

    public static void doStuffEnemy( Ship anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
