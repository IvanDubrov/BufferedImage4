package buffered;

import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class FirstThreeLimitApX extends Repository {
    ArrayList<ArrayListFindX> AllArrayApX = new ArrayList<ArrayListFindX>();
    int k = 0;
    int i = 0;


    public void marchThroughImage(BufferedImage image) {
        i = 0;
        getSizeImg(image);
        AllArrayApX.clear();
        max = image.getRGB(1, h / 3);
        min = 10000;

        for (int i = h / 3; i < h / 3 + 1; i++) { // for max and min
            for (int j = 120; j < w / 2; j++) {
                int pixel = image.getRGB(j, i);
                int green = (pixel >> 8) & 0xff;
                if (min >= green) {
                    min = green;
                }
                if (max <= green) {
                    max = green;
                }
            }
        }


        for (int i = h / 3; i < h / 3 + 1; i++) {     // for add AllArrayApX
            for (int j = 120; j < w / 2; j++) {
                //        System.out.println("x,y: " + j + ", " + i);
                int pixel = image.getRGB(j, i);
                int green = (pixel >> 8) & 0xff;
                int limit = min + 25;
                //        System.out.println(green);
                if (green < limit) {
                    AllArrayApX.add(new ArrayListFindX(j, i, green));
                }
                //         System.out.println("");

            }
        }
        AllArrayApX.add(new ArrayListFindX(w / 2, h + 26, 26)); // insert last element in AllArrayApX

        CreateArrayLimit();

        if (AllArrayLimitApX.get(0).getTochkaVhoda() < 200) {
            FirstThreeApX = new StringBuffer("1");
        } else {
            FirstThreeApX = new StringBuffer("0");
        }
        for (DotInputX dotInputXe : AllArrayLimitApX) {
            if (dotInputXe.getRastoyabieProbeloPosle() < 100) {
                FirstThreeApX.append("1");
            } else {
                FirstThreeApX.append("0");
            }
        }
        System.out.print("1 Test first number (AP) - "  + FirstThreeApX);
    }

    void CreateArrayLimit() {
        try {
            for (int j = i; i < AllArrayApX.size(); i++) {
                if (AllArrayApX.get(i + 1).getX() - AllArrayApX.get(i).getX() > 10) {
                    if (k < 10) {
                        k = 0;
                        i++;
                        CreateArrayLimit();
                    }
                    int dotInput = AllArrayApX.get(i).getX() - k;
                    AllArrayLimitApX.add(new DotInputX(dotInput, (AllArrayApX.get(i).getX()), AllArrayApX.get(i + 1).getX() - AllArrayApX.get(i).getX()));
                    k = 0;
                } else k++;
            }
        } catch (Exception ignored) {
        }


    }
}
