package net.cserny.games.thequest.enemy;

import net.cserny.games.thequest.Game;
import net.cserny.games.thequest.location.Point;

import java.util.Random;

public class Ghost extends AbstractEnemy {

    public Ghost(Point location, Game game) {
        super(location, game, 8);
    }

    @Override
    public void move(Random random) {
        if (hitPoints >= 1) {
            if (nearPlayer()) {
                game.hitPlayer(3, random);
            } else {
                if (random.nextInt(3) == 0) {
                    location = move(findPlayerDirection(game.getPlayerLocation()), game.getBoundaries());
                }
            }
        }
    }
}
