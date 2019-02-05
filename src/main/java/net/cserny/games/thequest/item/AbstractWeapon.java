package net.cserny.games.thequest.item;

import net.cserny.games.thequest.location.AbstractMover;
import net.cserny.games.thequest.location.Direction;
import net.cserny.games.thequest.Game;
import net.cserny.games.thequest.location.Point;
import net.cserny.games.thequest.enemy.AbstractEnemy;

import java.util.Random;

public abstract class AbstractWeapon extends AbstractMover {

    private boolean pickedUp;

    public AbstractWeapon(Point location, Game game) {
        super(location, game);
        this.pickedUp = false;
    }

    public abstract String getName();

    public void attack(Direction direction, Random random) {

    }

    public boolean nearby(Point enemyLocation, Point playerLocation, int radius) {
        return Math.abs(playerLocation.getX() - enemyLocation.getX()) < radius
                && Math.abs(playerLocation.getY() - enemyLocation.getY()) < radius;
    }

    public boolean isPickedUp() {
        return pickedUp;
    }

    public void pickUpWeapon() {
        pickedUp = true;
    }

    protected Direction clockwise(Direction direction) {
        switch (direction) {
            case UP:
                return Direction.RIGHT;
            case DOWN:
                return Direction.LEFT;
            case LEFT:
                return Direction.UP;
            default:
                return Direction.DOWN;
        }
    }

    protected Direction counterClockwise(Direction direction) {
        switch (direction) {
            case UP:
                return Direction.LEFT;
            case DOWN:
                return Direction.RIGHT;
            case LEFT:
                return Direction.DOWN;
            default:
                return Direction.UP;
        }
    }

    protected Direction opposite(Direction direction) {
        switch (direction) {
            case UP:
                return Direction.DOWN;
            case DOWN:
                return Direction.UP;
            case LEFT:
                return Direction.RIGHT;
            default:
                return Direction.LEFT;
        }
    }

    protected boolean damageEnemy(Direction direction, int radius, int damage, Random random) {
        Point target = game.getPlayerLocation();
        for (int distance = 0; distance < radius; distance++) {
            for (AbstractEnemy enemy : game.getEnemies()) {
                if (nearby(enemy.getLocation(), target, radius)) {
                    enemy.hit(damage, random);
                    return true;
                }
            }
            target = move(direction, game.getBoundaries());
        }
        return false;
    }
}
