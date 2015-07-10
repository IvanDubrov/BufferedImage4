package buffered;

import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class FirstThreeLimitY extends Repository {
    ArrayList<DotInputY> AllArrayLimitY = new ArrayList<DotInputY>();
    ArrayList<ArrayListFindY> AllArrayY = new ArrayList<ArrayListFindY>();

    CreateWord createWord = new CreateWord();
    int k = 0;
    int kol = 0;
    int i = 0;
    int lol = 0;

    public String marchThroughImage(BufferedImage image) {


        for (DotInputX ApX : AllArrayLimitApX) {

            poiskPoChicky(image, ApX.getTochkaVhoda() - 25);
            CreateArrayLimit();
            ShoyResult();
           /* end.division(FirstThreeApX);
            end.division2(FirstThreeDownX);*/

        }
        StringBuffer div = createWord.division(FirstThreeApX);
        System.out.print("2 Test first number (Down) - " + div);
        StringBuffer div1 = createWord.division2(FirstThreeDownX);
        System.out.print("2 Test first number (Down) - " + div1);

        try {
            for (int i = 0; i < 3; i++) {
                if (div.charAt(i) == '1' || div1.charAt(i) == '1') {
                    arrayListNumberies.remove(i);
                }
            }
        } catch (Exception ignored) {

        }
        return String.valueOf((createWord.number(div, div1)));
    }

    private void ShoyResult() {
        FirstThreeY = new StringBuffer();
        for (DotInputY tochkavhodaXe : AllArrayLimitY) {

            if (tochkavhodaXe.getRastoyabieProbeloPosle() > 10) {
                {
                    if (tochkavhodaXe.getTochkaVhoda() < 75) {
                        FirstThreeY.append("1");
                    }
                    if (tochkavhodaXe.getTochkaVhoda() < 150 & tochkavhodaXe.getTochkaVhoda() > 75) {
                        FirstThreeY.append("2");
                    }
                    if (tochkavhodaXe.getTochkaVhoda() > 150) {
                        FirstThreeY.append("3");

                    }
                }
            }
        }
        if (String.valueOf(FirstThreeY).isEmpty()) {
            FirstThreeY.append(0);
        }
        //  System.out.print(" FirstThreeY - " + FirstThreeY);
        arrayListNumberies.add(new ArrayListNumberY(FirstThreeY));
        AllArrayLimitY.clear();
    }

    private void poiskPoChicky(BufferedImage image, int dotStart) {
        int h = image.getHeight();
        for (int i = 10; i < h; i++) {
            for (int j = dotStart; j < dotStart + 1; j++) {
                //            System.out.println("x,y: " + j + ", " + i);
                int pixel = image.getRGB(j, i);
                int green = (pixel >> 8) & 0xff;
                int limit = min + 20;
                if (green < limit) {
                    AllArrayY.add(new ArrayListFindY(j, i, green));
                }

            }
        }
    }

    void CreateArrayLimit() {

        AllArrayY.add(new ArrayListFindY(w, h, 26));
        try {
            for (int j = i; i < AllArrayY.size() - 1; i++) {

                if (AllArrayY.get(i + 1).getY() - AllArrayY.get(i).getY() > 10) {
                    if (k < 20) {
                        k = 0;
                        i++;
                        CreateArrayLimit();
                    }
                    int dotInput = AllArrayY.get(i).getY() - k;
                    AllArrayLimitY.add(new DotInputY(dotInput, (AllArrayY.get(i).getY()), AllArrayY.get(i + 1).getY() - AllArrayY.get(i).getY()));
                    kol++;
                    k = 0;
                } else k++;
            }
        } catch (Exception ignored) {
            i = 0;
        }
        i = 0;
    }


}


