package net.cserny.games.thequest.location;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void addToX(int addX) {
        this.x += addX;
    }

    public void subtractFromX(int subtractX) {
        this.x -= subtractX;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void addToY(int addY) {
        this.y += addY;
    }

    public void subtractFromY(int subtractY) {
        this.y -= subtractY;
    }
}
