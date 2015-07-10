package buffered;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainGo extends Component {
    FirstThreeLimitApX firstThreeCreateLimitForApX = new FirstThreeLimitApX();
    FirstThreeLimitY FirstThreeCreateLimitForY = new FirstThreeLimitY();
    FirstThreeLimitDownX FirstThreeCreateLimitForDownX = new FirstThreeLimitDownX();

    LimitApX createLimitForApX = new LimitApX();
    LimitY createLimitForY = new LimitY();
    LimitDownX createLimitForDownX = new LimitDownX();

    public static void main(String[] foo) {
        new MainGo();
    }

    String[] MainGo1(String[] ddd) {

        String[] word = new String[1000];
        for (int i = 0; i < ddd.length; i++) {
            try {
                StringBuffer yyy = new StringBuffer();
               // BufferedImage image = ImageIO.read(this.getClass().getResource("C:\\img" + ddd[i]));
                File f = new File("C:\\img\\" + ddd[i]);
                BufferedImage image = ImageIO.read(f);
                firstThreeCreateLimitForApX.marchThroughImage(image); //for first x (ap)
                FirstThreeCreateLimitForDownX.marchThroughImage(image); //for first x (down)
                yyy.append(FirstThreeCreateLimitForY.marchThroughImage(image)); //for first y

                createLimitForApX.marchThroughImage(image); //for x (ap)
                createLimitForDownX.marchThroughImage(image); //for x (down)
                yyy.append(createLimitForY.marchThroughImage(image)); //for y
                word[i] = String.valueOf(yyy);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
        return word;
    }

    public MainGo() {
    }

}