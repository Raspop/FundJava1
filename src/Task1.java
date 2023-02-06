public class Task1 {
    public static void main(String[] args) {
        String result = mergeStrings("a", "a", "a", "a", "a", "a", "a", "a", "a");

        System.out.println(result);
    }

    static String mergeStrings(String... strings) {
        if (strings.length == 0) {
            return "";
        }

        var result = "";

        for (String s : strings) {
            result += " " + s;
        }

        return result.trim();
    }
}
