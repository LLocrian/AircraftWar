package edu.hitsz.supply;

import edu.hitsz.aircraft.HeroAircraft;


public class RecoverSupply extends BaseSupply {
    public RecoverSupply(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }
    public void effect(HeroAircraft heroAircraft) {
        heroAircraft.increaseHp(30);
        vanish();
    }
}
