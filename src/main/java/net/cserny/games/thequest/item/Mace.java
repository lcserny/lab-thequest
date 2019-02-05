package net.cserny.games.thequest.item;

import net.cserny.games.thequest.location.Direction;
import net.cserny.games.thequest.Game;
import net.cserny.games.thequest.location.Point;

import java.util.Random;

public class Mace extends AbstractWeapon {

    public Mace(Point location, Game game) {
        super(location, game);
    }

    @Override
    public String getName() {
        return "Mace";
    }

    @Override
    public void attack(Direction direction, Random random) {
        damageEnemy(Direction.LEFT, 20, 6, random);
        damageEnemy(Direction.UP, 20, 6, random);
        damageEnemy(Direction.RIGHT, 20, 6, random);
        damageEnemy(Direction.DOWN, 20, 6, random);
    }
}
