import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private final String name;
    private final int minNameLenght = 3;
    private final int maxNameLenght = 19;

    public Account(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }
    }

    public boolean checkNameToEmboss() {
        String pattern = "^(?=.{3,19}$)[A-Za-zА-Яа-я]{1,17} [A-Za-zА-Яа-я]{1,17}$";
        Pattern reg = Pattern.compile(pattern);
        Matcher isCorrect = reg.matcher(name);
        if (isCorrect.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
