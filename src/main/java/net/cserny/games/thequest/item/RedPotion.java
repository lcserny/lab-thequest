package net.cserny.games.thequest.item;

import net.cserny.games.thequest.location.Direction;
import net.cserny.games.thequest.Game;
import net.cserny.games.thequest.location.Point;

import java.util.Random;

public class RedPotion extends AbstractWeapon implements Potion {

    private boolean used = false;

    public RedPotion(Point location, Game game) {
        super(location, game);
    }

    @Override
    public String getName() {
        return "Red Potion";
    }

    @Override
    public boolean getUsed() {
        return used;
    }

    @Override
    public void attack(Direction direction, Random random) {
        if (!used) {
            game.increasePlayerHealth(10, random);
        }
        used = true;
    }
}
