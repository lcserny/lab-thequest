package net.cserny.games.thequest.item;

import net.cserny.games.thequest.location.Direction;
import net.cserny.games.thequest.Game;
import net.cserny.games.thequest.location.Point;

import java.util.Random;

public class Bow extends AbstractWeapon {

    public Bow(Point location, Game game) {
        super(location, game);
    }

    @Override
    public String getName() {
        return "Bow";
    }

    @Override
    public void attack(Direction direction, Random random) {
        damageEnemy(direction, 60, 1, random);
    }
}
