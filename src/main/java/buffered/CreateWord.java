package buffered;

/**
 * Created by Ivan on 30.06.2015.
 */
public class CreateWord extends Repository {
    public CreateWord() {
    }

    StringBuffer division(StringBuffer word) {
        word.append(0);
        StringBuffer divisionEl = new StringBuffer();
        try {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == '0') {
                    divisionEl.append(0);
                }
                if (word.charAt(i) == '1' & word.charAt(i + 1) == '0') {
                    divisionEl.append(5);
                }
                if (word.charAt(i) == '1' & word.charAt(i + 1) == '1') {
                    divisionEl.append(1);
                    i++;
                }

            }
        } catch (Exception ignored) {
        }

        return divisionEl;
    }

    StringBuffer division2(StringBuffer word2) {
        word2.append(0);
        StringBuffer divisionEl = new StringBuffer();
        try {
            for (int i = 0; i < word2.length(); i++) {
                if (word2.charAt(i) == '0') {
                    divisionEl.append(0);
                }
                if (word2.charAt(i) == '1' & word2.charAt(i + 1) == '0') {
                    divisionEl.append(1);
                }
                if (word2.charAt(i) == '1' & word2.charAt(i + 1) == '1') {
                    divisionEl.append(1);
                    i++;
                }

            }
        } catch (Exception ignored) {
        }
        return divisionEl;
    }

    public StringBuffer number(StringBuffer o, StringBuffer o2) {
        StringBuffer word = new StringBuffer();
        if (arrayListNumberies.size() < 3) {
            arrayListNumberies.add(new ArrayListNumberY(new StringBuffer().append(0)));
            arrayListNumberies.add(new ArrayListNumberY(new StringBuffer().append(0)));
            arrayListNumberies.add(new ArrayListNumberY(new StringBuffer().append(0)));
        }
        try {
            for (int i = 0; i < 3; i++) {
                Integer i1 = new Integer(String.valueOf(arrayListNumberies.get(i).KodChicla));
                if (o.charAt(i) == '0' & o2.charAt(i) == '1') {
                    switch (i1) {

                        case 0:
                            word.append(2);
                            break;
                        case 12:
                            word.append(2);
                            break;
                        case 2:
                            word.append(2);
                            break;
                        case 13:
                            word.append(2);
                            break;
                        case 1:
                            word.append(2);
                            break;
                        case 123:
                            word.append(2);
                            break;
                    }
                }
                if (division(o).charAt(i) == '0' & division(o2).charAt(i) == '0') {
                    switch (i1) {
                        case 0:
                            word.append(1);
                            break;
                        case 1:
                            word.append(7);
                            break;
                        case 123:
                            word.append(3);
                            break;
                    }
                }
                if (o.charAt(i) == '1' && o2.charAt(i) == '0') {
                    switch (i1) {
                        case 0:
                            word.append(0);
                            break;
                        case 12:
                            word.append(4);
                            break;
                        case 2:
                            word.append(4);
                            break;
                        case 13:
                            word.append(9);
                            break;
                        case 1:
                            word.append(9);
                            break;
                        case 123:
                            word.append(9);
                            break;

                    }
                }

                if (o.charAt(i) == '1' & o2.charAt(i) == '1') {
                    switch (i1) {
                        case 0:
                            word.append(0);
                            break;
                        case 3:
                            word.append(0);
                            break;
                        case 13:
                            word.append(0);
                            break;
                        case 1:
                            word.append(0);
                            break;
                        case 123:
                            word.append(8);
                            break;

                    }

                }
            }
            arrayListNumberies.clear();
        } catch (Exception ignored) {
            arrayListNumberies.clear();
        }
        return word;

    }
}
