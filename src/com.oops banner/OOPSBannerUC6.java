public class OOPSBannerUC6{

    /* ---------- Helper Methods ---------- */

    // Pattern for letter O
    static String[] getOPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " **   ** "),
            String.join("", "**     **"),
            String.join("", "**     **"),
            String.join("", "**     **"),
            String.join("", " **   ** "),
            String.join("", "  *****  ")
        };
    }

    // Pattern for letter P
    static String[] getPPattern() {
        return new String[] {
            String.join("", " ******  "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " ******  "),
            String.join("", " **      "),
            String.join("", " **      "),
            String.join("", " **      ")
        };
    }

    // Pattern for letter S
    static String[] getSPattern() {
        return new String[] {
            String.join("", "  ****** "),
            String.join("", " **      "),
            String.join("", " **      "),
            String.join("", "  *****  "),
            String.join("", "      ** "),
            String.join("", "      ** "),
            String.join("", " ******  ")
        };
    }

    /* ---------- Main Method ---------- */

    public static void main(String[] args) {

        // Array initialization via methods
        String[] O1 = getOPattern();
        String[] O2 = getOPattern();
        String[] P  = getPPattern();
        String[] S  = getSPattern();

        String[] banner = new String[7];

        // Assemble banner lines
        for (int i = 0; i < 7; i++) {
            banner[i] = O1[i] + " " + O2[i] + " " + P[i] + " " + S[i];
        }

        // Loop-based rendering (Enhanced for loop)
        for (String line : banner) {
            System.out.println(line);
        }
    }
}