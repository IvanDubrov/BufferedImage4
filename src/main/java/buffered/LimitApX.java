package buffered;

import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class LimitApX extends Repository {

    ArrayList<ArrayListFindX> AllArrayApX = new ArrayList<ArrayListFindX>();
    int k = 0;
    int i = 0;

    public void marchThroughImage(BufferedImage image) {

        getSizeImg(image);
        max = image.getRGB(w / 2, h / 3);

        for (int i = h / 3; i < h / 3 + 1; i++) { // для max - min
            for (int j = w / 2; j < w; j++) {
                int pixel = image.getRGB(j, i);
                int gray = (pixel) & 0xff2F4F4F;
                if (min >= gray) {
                    min = gray;
                }
                if (max <= gray) {
                    max = gray;
                }
            }
        }


        for (int i = h / 3; i < h / 3 + 1; i++) {
            for (int j = w / 2; j < w; j++) {
                //   System.out.println("x,y: " + j + ", " + i);
                int pixel = image.getRGB(j, i);
                int gray = (pixel) & 0xff2F4F4F;
                int limit = min + 1000000;
                //    System.out.println(gray);
                if (gray < limit) {
                    AllArrayApX.add(new ArrayListFindX(j, i, gray));
                }
                //     System.out.println("");

            }
        }
        AllArrayApX.add(new ArrayListFindX(w, h + 26, 26)); // insert last element
        CreateArrayLimit();

        if (AllArrayLimitApX.get(0).getTochkaVhoda() - w / 2 < 100) {
            ApX = new StringBuffer("1");
        } else {
            ApX = new StringBuffer("0");
        }
        for (DotInputX dotInputXe : AllArrayLimitApX) {
            if (dotInputXe.getRastoyabieProbeloPosle() < 80) {
                ApX.append("1");
            } else {
                ApX.append("0");
            }
        }
    }
    void CreateArrayLimit() {
        AllArrayLimitApX.clear();
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
