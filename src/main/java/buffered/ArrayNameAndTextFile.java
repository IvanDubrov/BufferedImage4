package buffered;

/**
 * Created by Ivan on 28.05.2015.
 */
public class ArrayNameAndTextFile {

    public ArrayNameAndTextFile(String nameFile, String imgText) {
        this.name = nameFile;
        this.text = imgText;
    }

    String name;
    String text;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
