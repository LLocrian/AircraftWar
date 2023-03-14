package edu.hitsz.supply;

import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.application.Main;
import edu.hitsz.basic.AbstractFlyingObject;
import edu.hitsz.supply.BaseSupply;

import java.util.Collection;

public class RecoverSupply extends BaseSupply {
    public RecoverSupply(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }
    public void effect(HeroAircraft heroAircraft) {
        heroAircraft.increaseHp(10);
        vanish();
    }
}
