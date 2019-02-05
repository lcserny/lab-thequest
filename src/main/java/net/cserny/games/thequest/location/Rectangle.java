package net.cserny.games.thequest.location;

public class Rectangle {

    private final int top;
    private final int bottom;
    private final int left;
    private final int right;

    public Rectangle(int top, int bottom, int left, int right) {
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}
