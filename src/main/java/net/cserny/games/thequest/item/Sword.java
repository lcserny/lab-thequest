package net.cserny.games.thequest.item;

import net.cserny.games.thequest.location.Direction;
import net.cserny.games.thequest.Game;
import net.cserny.games.thequest.location.Point;

import java.util.Random;

public class Sword extends AbstractWeapon {

    public Sword(Point location, Game game) {
        super(location, game);
    }

    @Override
    public String getName() {
        return "Sword";
    }

    @Override
    public void attack(Direction direction, Random random) {
        if (!damageEnemy(direction, 35, 3, random)) {
            if (!damageEnemy(clockwise(direction), 35, 3, random)) {
                damageEnemy(counterClockwise(direction), 35, 3, random);
            }
        }
    }
}
