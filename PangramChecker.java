public class PangramChecker {
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }

        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(inputSentence);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}