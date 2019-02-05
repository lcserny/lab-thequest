package net.cserny.games.thequest.enemy;

import net.cserny.games.thequest.location.Direction;
import net.cserny.games.thequest.Game;
import net.cserny.games.thequest.location.Point;

import java.util.Random;

public class Bat extends AbstractEnemy {

    public Bat(Point location, Game game) {
        super(location, game, 6);
    }

    @Override
    public void move(Random random) {
        if (hitPoints >= 1) {
            if (nearPlayer()) {
                game.hitPlayer(2, random);
            } else {
                if (random.nextInt(2) == 0) {
                    location = move(findPlayerDirection(game.getPlayerLocation()), game.getBoundaries());
                } else {
                    location = move(Direction.fromInt(random.nextInt(4)), game.getBoundaries());
                }
            }
        }
    }
}
