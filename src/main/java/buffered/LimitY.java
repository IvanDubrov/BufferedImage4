package buffered;

import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class LimitY extends Repository {
    ArrayList<DotInputY> AllArrayLimitY = new ArrayList<DotInputY>();
    ArrayList<ArrayListFindY> AllArrayY = new ArrayList<ArrayListFindY>();


    int k = 0;
    int kol = 0;
    int i = 0;
    int lol = 0;
    CreateWord createWord = new CreateWord();

    public String marchThroughImage(BufferedImage image) {

        for (DotInputX Apx1 : AllArrayLimitApX) {
            findNumber(image, Apx1.getTochkaVhoda() - 25);
            CreateArrayLimit();
            ShowResult();

        }
        StringBuffer divisionsApX = createWord.division(ApX);
        StringBuffer divisionsDownX = createWord.division2(DownX);
        try {
            for (int i = 0; i < 3; i++) {

                if (divisionsApX.charAt(i) == '1' || divisionsDownX.charAt(i) == '1') {
                    arrayListNumberies.remove(i);
                }
            }
        } catch (Exception ignored) {

        }
        AllArrayLimitApX.clear();
        return String.valueOf(createWord.number(divisionsApX, divisionsDownX));  // Go in Class END

    }

    private void ShowResult() {
        Y = new StringBuffer();
        for (DotInputY dotInputYEl : AllArrayLimitY) {

            if (dotInputYEl.getRastoyabieProbeloPosle() > 10) {
                {
                    if (dotInputYEl.getTochkaVhoda() < 75) {
                        Y.append("1");
                    }
                    if (dotInputYEl.getTochkaVhoda() < 150 & dotInputYEl.getTochkaVhoda() > 75) {
                        Y.append("2");
                    }
                    if (dotInputYEl.getTochkaVhoda() > 150) {
                        Y.append("3");

                    }
                }
            }
        }
        if (String.valueOf(Y).isEmpty()) {
            Y.append(0);
        }
        //  System.out.println(Y);
        arrayListNumberies.add(new ArrayListNumberY(Y));
        AllArrayLimitY.clear();
    }

    private void findNumber(BufferedImage image, int startY) {
        int h = image.getHeight();
        for (int i = 5; i < h; i++) {
            for (int j = startY; j < startY + 1; j++) {
                //            System.out.println("x,y: " + j + ", " + i);
                int pixel = image.getRGB(j, i);
                int gray = (pixel) & 0xff2F4F4F;
                int limit = min + 1000000;
                if (gray < limit) {
                    AllArrayY.add(new ArrayListFindY(j, i, gray));
                }

            }
        }
    }

    void CreateArrayLimit() {
        AllArrayY.add(new ArrayListFindY(w, h, 26));
        try {
            for (int j = i; i < AllArrayY.size() - 1; i++) {

                if (AllArrayY.get(i + 1).getY() - AllArrayY.get(i).getY() > 10) {
                    if (k < 10) {
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
        }
    }


}


