import java.util.ArrayList;

public class BaiTapCheckDinhDang {
    public static void main(String[] args) {

    }

    private boolean checkArrayIsInValid(ArrayList<String> list) {
        if (list.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (checkStringIsInvalid(list.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    private boolean checkStringIsInvalid(String string) {
        // normalize string
        // lam dep du lieu
        // cat o day luon cho do ton cong
        if (string.length() == 8) {
//            return checkFirstCharactersInvalid(string.substring(0, string.length() - 4)) || checkLastCharactersInvalid(string.substring(string.length() - 4));
            String firstCharacters = string.substring(0, string.length() - 4);
            String lastCharacters = string.substring(string.length() - 4);
            return  checkFirstCharactersInvalid(firstCharacters) || checkLastCharactersInvalid(lastCharacters);
        } else {
            return true;
        }
    }

    private boolean checkFirstCharactersInvalid(String string) {
        // co the cat 4 ki tu dau tien o day
        // check 00yL (y tu 2 - 5)
        for (int i = 0; i < string.length(); i++) {
            switch (i) {
                case 0: case 1:
                    if (string.charAt(i) != '0') {
                        return true;
                    }
                    break;
                case 2:
                    if (Character.isDigit(string.charAt(i))) {
                        int characterIntValue = Character.getNumericValue(string.charAt(i));
                        return characterIntValue >= 2 && characterIntValue < 5;
                    }
                    break;
                case 3:
                    if (string.charAt(i) != 'L') {
                        return true;
                    }
                    break;
                default:
                    return true;
            }
        }
        return true;
    }

    private boolean checkLastCharactersInvalid(String string) {
        return true;
    }
}
