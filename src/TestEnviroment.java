import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * Created by bachi on 10.10.2016.
 */
public class TestEnviroment {
    public static void main(String[] args) {

        TestEnviroment testEnviroment = new TestEnviroment();


    }

    public TestEnviroment() {
        testeAnagramAnalyse4(100);
    }

    private void testeAnagramAnalyse4(int durchlaeufe) {
        StringLogik stringLogik = new StringLogik();
        AnagrammAnalyse anagrammAnalyse = new AnagrammAnalyse();
        long summe = 0;
        long max = 0;
        long min = 0;
        for (int i = 0; i < durchlaeufe; i++) {
            String wort1 = stringLogik.stringGenerator(10000);
            String wort2 = stringLogik.anagramMaker(wort1, 1000);

            long start = System.nanoTime();
            boolean isAna = anagrammAnalyse.algorithmus(wort1, wort2);
            long ende = System.nanoTime();
            summe += ende-start;
            if (ende-start < min || min == 0) min = ende-start;
            if (ende-start > max) max = ende-start;
            System.out.println( i+1 + ". Durchlauf - " + (ende-start) + " Nanosekunden - Anagramm: "+ isAna);
        }
        System.out.println("Best Case: " + min);
        System.out.println("Worest Case: " + max);
        System.out.println("Average Case: " + summe/durchlaeufe);

    }


}
