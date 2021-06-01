package objectOrientedProgramming3;

public class Pair<T, V> {
    private T x;
    private V y;

    public Pair(T x, V y) {
        setX(x);
        setY(y);
    }

    private T getX() {
        return x;
    }

    private void setX(T x) {
        this.x = x;
    }

    private V getY() {
        return y;
    }

    private void setY(V y) {
        this.y = y;
    }

    public void print() {
        System.out.println(getX() + " " + getY());
    }
}
