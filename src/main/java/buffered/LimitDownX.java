package buffered;

import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class LimitDownX extends Repository {
    ArrayList<DotInputXDown> AllArrayLimitDownX = new ArrayList<DotInputXDown>();
    ArrayList<ArrayListFindX> AllArrayDownX = new ArrayList<ArrayListFindX>();

    int i = 0;

    public void marchThroughImage(BufferedImage image) {


        for (int i = (int) (h / (1.5)); i < (int) (h / (1.5)) + 1; i++) {
            for (int j = w / 2; j < w; j++) {
                //    System.out.println("x,y: " + j + ", " + i);
                int pixel = image.getRGB(j, i);
                int gray = (pixel) & 0xff2F4F4F;
                int lol = min + 1000000;
                //     System.out.println(gray);
                if (gray < lol) {
                    AllArrayDownX.add(new ArrayListFindX(j, i, gray));
                }
                //    System.out.println("");
            }
        }
        AllArrayDownX.add(new ArrayListFindX(w, h + 26, 26)); // insert last element
        CreateArrayLimit();

        if (AllArrayLimitDownX.get(0).getTochkaVhoda() - w / 2 < 100) {
            DownX = new StringBuffer("1");
        } else {
            DownX = new StringBuffer("0");
        }
        for (DotInputXDown tochkavhodaXe : AllArrayLimitDownX) {
            if (tochkavhodaXe.getRastoyabieProbeloPosle() < 80) {
                DownX.append("1");
            } else {
                DownX.append("0");
            }
        }
        System.out.println("Down - " + DownX);

    }


    int k = 0;


    void CreateArrayLimit() {
        try {


            for (int j = i; i < AllArrayDownX.size() - 1; i++) {
                if (AllArrayDownX.get(i + 1).getX() - AllArrayDownX.get(i).getX() > 10) {
                    if (k < 10) {
                        k = 0;
                        i++;
                        CreateArrayLimit();
                    }
                    int dotInput = AllArrayDownX.get(i).getX() - k;
                    AllArrayLimitDownX.add(new DotInputXDown(dotInput, (AllArrayDownX.get(i).getX()), AllArrayDownX.get(i + 1).getX() - AllArrayDownX.get(i).getX()));
                    k = 0;
                } else k++;
            }

        } catch (Exception ignored) {
        }
    }
}
