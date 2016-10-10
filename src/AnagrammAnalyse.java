/**
 * Created by bachi on 10.10.2016.
 */
public class AnagrammAnalyse {

    public boolean algorithmus(String a, String b) {
        int word1[] = new int[26];
        int word2[] = new int[26];
        boolean isAna = true;

        for (int i = 0; i < a.length(); i++) {
            int pos = (int) a.charAt(i)-97;
            word1[pos]++;
        }
        for (int i = 0; i < b.length(); i++) {
            int pos = (int) b.charAt(i)-97;
            word2[pos]++;
        }
        for (int i = 0; i < word1.length; i++) {
            if (word1[i] != word2[i]) {
                isAna = false;
            }
        }
        return isAna;
    }
}
