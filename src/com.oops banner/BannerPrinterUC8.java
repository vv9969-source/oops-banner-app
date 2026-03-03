import java.util.HashMap;
import java.util.Map;

public class BannerPrinterUC8 {

    public static void main(String[] args) {

        Map<Character, String[]> bannerMap = new HashMap<>();

        bannerMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        bannerMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        bannerMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        String word = "OOPS";
        printBanner(word, bannerMap);
    }

    public static void printBanner(String word, Map<Character, String[]> bannerMap) {

        int height = bannerMap.get(word.charAt(0)).length;

        for (int row = 0; row < height; row++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = bannerMap.get(ch);
                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }
}