public class Account {
    private final String name;
    private final int minNameLenght = 3;
    private final int maxNameLenght = 19;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if ((checkLenght(name)) && (checkSpaces(name))) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkSpaces(String checkedName) {
        if ((checkedName.indexOf(" ") > 0) && (checkedName.lastIndexOf(" ") < checkedName.length()-1) && (checkedName.indexOf(" ", checkedName.indexOf(" ")+1) == -1)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkLenght(String str) {
        if ((str.length() >= minNameLenght) && (str.length() <= maxNameLenght)) {
            return true;
        } else {
            return false;
        }
    }
}
