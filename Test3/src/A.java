public class A {
    private boolean up = true;
    private boolean down = true;
    public int x = 0, y = 0;

    //y belongs to (0,10)-to not deal with negative digits,User can type (-5,5);
    public A(int x, int y) {
        this.x = x + 5;
        this.y = y + 5;
        if (y >= 10)
            up = false;
        if (y <= 0)
            down = false;
    }

    public A(int x) {
        this.x = x+5;
        this.y = 5;
    }

    public A(int y) {
        this.y = y+5;
        this.x = 5;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int i)throws MovementNotPermitted{
        if (i % 2 == 0) {
            y += 1;
        }
        else y -= 1;
    }
}
