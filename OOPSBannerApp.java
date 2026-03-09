import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(patternMap.get(c)[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        String word = "OOPS";

        renderBanner(word, patternMap);
    }
}
