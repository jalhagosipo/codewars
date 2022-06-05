package kata.kyu8;

public class RemoveChars {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String remove_clever(String str) {
        return str.replaceAll("^.|.$", "");
    }
}
