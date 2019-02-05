package net.cserny.games.thequest.enemy;

import net.cserny.games.thequest.location.AbstractMover;
import net.cserny.games.thequest.location.Direction;
import net.cserny.games.thequest.Game;
import net.cserny.games.thequest.location.Point;

import java.util.Random;

public abstract class AbstractEnemy extends AbstractMover {

    private static final int nearPlayerDistance = 30;
    protected int hitPoints;
    private boolean dead;

    public AbstractEnemy(Point location, Game game, int hitPoints) {
        super(location, game);
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public boolean isDead() {
        return hitPoints <= 0;
    }

    public abstract void move(Random random);

    public void hit(int maxDamage, Random random) {
        hitPoints -= random.nextInt(maxDamage);
    }

    protected boolean nearPlayer() {
        return nearby(game.getPlayerLocation(), nearPlayerDistance);
    }

    protected Direction findPlayerDirection(Point playerLocation) {
        if (playerLocation.getX() > location.getX() + 10) {
            return Direction.RIGHT;
        } else if (playerLocation.getX() < location.getX() - 10) {
            return Direction.LEFT;
        } else if (playerLocation.getY() > location.getY() - 10) {
            return Direction.DOWN;
        } else {
            return Direction.UP;
        }
    }
}
