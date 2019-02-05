package net.cserny.games.thequest.location;

public enum Direction {
    UP, DOWN, RIGHT, LEFT;

    // FIXME: which direction is what int?
    public static Direction fromInt(int value) {
        switch (value) {
            case 0:
                return UP;
            case 1:
                return DOWN;
            case 2:
                return LEFT;
            case 3:
                return RIGHT;
            default:
                return null;
        }
    }
}
