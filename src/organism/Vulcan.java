package organism;

import traits.Reparable;
import type.Alien;
import type.Crop;

public class Vulcan implements Alien, Reparable{

    @Override
    public void talk(Alien a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'talk'");
    }

    @Override
    public void attack(Alien a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    @Override
    public void compliment(Alien a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compliment'");
    }

    @Override
    public void getAttacked() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAttacked'");
    }

    @Override
    public void getCompliment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCompliment'");
    }

    @Override
    public void travel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'travel'");
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sleep'");
    }

    @Override
    public void pilot() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pilot'");
    }

    @Override
    public boolean isRepaired() {
        return true; // I set true for organism being in full health. 
    }

    @Override
    public void repair() {
        //maybe increase health here
        System.out.println("Vulcan repaired using advanced tech.");
    }
    
    @Override
    public void harvest(Crop c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'harvest'");
    }
    
}
