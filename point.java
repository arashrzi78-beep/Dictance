public class Point {
    private int x;
    private int y;

    public Point(int firstNum, int secondNum) {
        this.x = firstNum;
        this.y = secondNum;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int firstNum) {
        x = firstNum;
    }

    public void setY(int secondNum) {
        y = secondNum;
    }

    public String display() {
        return " x = " + x + "     y = " + y;
    }
}
