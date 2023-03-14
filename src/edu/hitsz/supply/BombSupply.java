package edu.hitsz.supply;

import edu.hitsz.aircraft.HeroAircraft;

/**
 * @author Tari
 */
public class BombSupply extends BaseSupply {
    public BombSupply(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }
    public void effect(HeroAircraft heroAircraft) {
        System.out.println("BombSupply active");
        vanish();
    }
}
