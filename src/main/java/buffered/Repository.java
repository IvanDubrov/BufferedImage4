package buffered;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by Ivan on 20.06.2015.
 */
public abstract class Repository {

    static int w;
    static int h;

    void getSizeImg(BufferedImage image) {
        w = image.getWidth();
        h = image.getHeight();
    }
   static ArrayList<ArrayListNumberY> arrayListNumberies = new ArrayList<ArrayListNumberY>();
    static ArrayList<DotInputX> AllArrayLimitApX = new ArrayList<DotInputX>();
    static int min;
    int max;
    static StringBuffer FirstThreeApX;
    static StringBuffer FirstThreeDownX;
    static StringBuffer FirstThreeY;
    static StringBuffer ApX;
    static StringBuffer DownX;
    static StringBuffer Y;
}
