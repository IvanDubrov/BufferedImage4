package buffered;

/**
 * Created by Ivan on 20.06.2015.
 */
public class DotInputX {
    private int TochkaVhoda;
    private int TochkaVihoda;
    private int RastoyabieProbeloPosle;

    public DotInputX(int tochkaVhoda, int tochkaVihoda, int rastoyabieProbeloPosle) {
        TochkaVhoda = tochkaVhoda;
        TochkaVihoda = tochkaVihoda;
        RastoyabieProbeloPosle = rastoyabieProbeloPosle;
    }

    public int getTochkaVhoda() {
        return TochkaVhoda;
    }

    public void setTochkaVhoda(int tochkaVhoda) {
        this.TochkaVhoda = tochkaVhoda;
    }

    public int getTochkaVihoda() {
        return TochkaVihoda;
    }

    public void setTochkaVihoda(int tochkaVihoda) {
        this.TochkaVihoda = tochkaVihoda;
    }

    public int getRastoyabieProbeloPosle() {
        return RastoyabieProbeloPosle;
    }

    public void setRastoyabieProbeloPosle(int rastoyabieProbeloPosle) {
        RastoyabieProbeloPosle = rastoyabieProbeloPosle;
    }
}
