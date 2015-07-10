package buffered;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public  void main() {
        MainGo mainGo = new MainGo();
        ArrayList<ArrayNameAndTextFile> arrayNameAndTextFile = new ArrayList<ArrayNameAndTextFile>();
        File f = new File("C:\\img");
        String ListNameFile[] = f.list();
        String listTextIMG[] = mainGo.MainGo1(ListNameFile); // GoInClassBuffered
        for (int i = 0; i < ListNameFile.length; i++) {

            //ADD IN COLLECTION NAME FILE AND IMG TEXT
            arrayNameAndTextFile.add(new ArrayNameAndTextFile(ListNameFile[i], listTextIMG[i]));

            String nameFileTXT = ListNameFile[i];
            nameFileTXT = nameFileTXT.replace(".jpg", ".txt");

            //CREATE TXT FILE AND WRITE IMG TEXT
            File f2 = new File("C:\\result\\" + nameFileTXT);
            FileOutputStream output;
            try {
                output = new FileOutputStream(f2);
                output.write(listTextIMG[i].getBytes());
                output.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
//OUTPUT IMG TEXT WITH
        ListIterator<ArrayNameAndTextFile> iter = arrayNameAndTextFile.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().getText());
        }
    }


}
