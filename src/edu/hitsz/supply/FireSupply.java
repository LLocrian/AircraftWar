package edu.hitsz.supply;

import edu.hitsz.aircraft.HeroAircraft;

public class FireSupply extends BaseSupply{
    public FireSupply(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }
    public void effect(HeroAircraft heroAircraft) {
        System.out.println("FireSupply active");
        vanish();
    }
}
