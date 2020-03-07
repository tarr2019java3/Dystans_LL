package pl.sda.dystans;

public class Point {private int x;
    private int y;

    public Point()
    {

    }

    public Point(int xx, int yy)
    {
        this.x = xx;
        this.y = yy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point point)
    {
        double result = Math.sqrt(Math.pow((y - x), 2) + Math.pow((point.getY() - point.getX()), 2));
        return result;
    }


}

