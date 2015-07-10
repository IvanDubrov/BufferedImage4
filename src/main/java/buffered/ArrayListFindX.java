package buffered;

/**
 * Created by Ivan on 19.06.2015.
 */
public class ArrayListFindX {
    private int x;
    private  int y;
    private int RGBGray;

    public ArrayListFindX(int x, int y, int RGBGray) {
        this.x = x;
        this.y = y;
        this.RGBGray = RGBGray;
    }

    public ArrayListFindX() {
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

    public int getRGBGray() {
        return RGBGray;
    }

    public void setRGBGray(int RGBGray) {
        this.RGBGray = RGBGray;
    }
}
