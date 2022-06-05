package kata.kyu8;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }

    public static String repeatStr_clever(final int repeat, final String string) {
        return java.util.stream.IntStream.range(0, repeat)
                .mapToObj(i -> string)
                .collect(java.util.stream.Collectors.joining()).toString();
    }
}
