package net.cserny.games.thequest.location;

import net.cserny.games.thequest.Game;

public abstract class AbstractMover {

    private static final int moveInternal = 10;
    protected Point location;
    protected Game game;

    public AbstractMover(Point location, Game game) {
        this.location = location;
        this.game = game;
    }

    public Point getLocation() {
        return location;
    }

    public boolean nearby(Point locationToCheck, int distance) {
        return (Math.abs(location.getX() - locationToCheck.getX()) < distance
                && Math.abs(location.getY() - locationToCheck.getY()) < distance);
    }

    public Point move(Direction direction, Rectangle boundaries) {
        switch (direction) {
            case UP:
                if (location.getY() - moveInternal >= boundaries.getTop()) {
                    location.subtractFromY(moveInternal);
                }
                break;
            case DOWN:
                if (location.getY() + moveInternal <= boundaries.getBottom()) {
                    location.addToY(moveInternal);
                }
                break;
            case LEFT:
                if (location.getX() - moveInternal >= boundaries.getLeft()) {
                    location.subtractFromX(moveInternal);
                }
                break;
            case RIGHT:
                if (location.getX() + moveInternal <= boundaries.getRight()) {
                    location.addToX(moveInternal);
                }
                break;
        }
        return location;
    }
}
