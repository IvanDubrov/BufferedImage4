package buffered;

import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class FirstThreeLimitDownX extends Repository {
    ArrayList<DotInputXDown> AllArrayLimitDownX = new ArrayList<DotInputXDown>();
    ArrayList<ArrayListFindX> AllArrayDownX = new ArrayList<ArrayListFindX>();

    int i = 0;
    int k = 0;
    public void marchThroughImage(BufferedImage image) {
        AllArrayDownX.clear();
        for (int i = (int) (h / (1.5)); i < (int) (h / (1.5)) + 1; i++) {
            for (int j = 120; j < w / 2; j++) {
                System.out.println("x,y: " + j + ", " + i);
                int pixel = image.getRGB(j, i);
                /*int DarkSalmon =(pixel) & 0xFFE9967A;
                int DarkSeaGreen =(pixel) & 0xFF8FBC8F;
                int DarkSlateBlue =(pixel) & 0xFF483D8B;
                int DarkSlateGray =(pixel) & 0xFF2F4F4F;
                int DarkSlateGrey =(pixel) & 0xFF2F4F4F;
                int DarkTurquoise =(pixel) & 0xFF00CED1;
                int DarkViolet =(pixel) & 0xFF9400D3;
                int gray = (pixel) & 0xff2F4F4F;*/
                int green = (pixel >> 8) & 0xff;
                int limit = min + 25;
                System.out.println(green);
                if (green < limit) {
                    AllArrayDownX.add(new ArrayListFindX(j, i, green));
                }
                System.out.println("");
            }
        }
        i = 0;
        AllArrayDownX.add(new ArrayListFindX(w / 2, h + 26, 26)); // insert last element
        AllArrayLimitDownX.clear();
        CreateArrayLimit();

        if (AllArrayLimitDownX.get(0).getTochkaVhoda() < 200) {
            FirstThreeDownX = new StringBuffer("1");
        } else {
            FirstThreeDownX = new StringBuffer("0");
        }
        for (DotInputXDown dotInputXDownEl : AllArrayLimitDownX) {
            if (dotInputXDownEl.getRastoyabieProbeloPosle() < 100) {
                FirstThreeDownX.append("1");
            } else {
                FirstThreeDownX.append("0");
            }
        }
        System.out.print("1 Test first number (Down) - "  + FirstThreeDownX);
    }


    void CreateArrayLimit() {

        try {
            for (int j = i; i < AllArrayDownX.size() - 1; i++) {
                if (AllArrayDownX.get(i + 1).getX() - AllArrayDownX.get(i).getX() > 10) {
                    if (k < 10) {
                        k = 0;
                        i++;
                        CreateArrayLimit();
                    }
                    int DotInput = AllArrayDownX.get(i).getX() - k;
                    AllArrayLimitDownX.add(new DotInputXDown(DotInput, (AllArrayDownX.get(i).getX()), AllArrayDownX.get(i + 1).getX() - AllArrayDownX.get(i).getX()));
                    k = 0;
                } else k++;
            }
        } catch (Exception ignored) {
        }
    }

}
