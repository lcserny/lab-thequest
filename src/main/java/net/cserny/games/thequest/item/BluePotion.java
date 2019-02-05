package net.cserny.games.thequest.item;

import net.cserny.games.thequest.location.Direction;
import net.cserny.games.thequest.Game;
import net.cserny.games.thequest.location.Point;

import java.util.Random;

public class BluePotion extends AbstractWeapon implements Potion {

    private boolean used = false;

    public BluePotion(Point location, Game game) {
        super(location, game);
    }

    @Override
    public boolean getUsed() {
        return used;
    }

    @Override
    public String getName() {
        return "Blue Potion";
    }

    @Override
    public void attack(Direction direction, Random random) {
        if (!used) {
            game.increasePlayerHealth(5, random);
        }
        used = true;
    }
}
