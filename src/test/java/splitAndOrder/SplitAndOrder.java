package splitAndOrder;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import java.util.*;

@Slf4j
public class SplitAndOrder {

    /**
    Aufgabe:
    Sortiere die Wörter nach ihrer Anzahl absteigend, so dass die Ausgabe folgendermassen aussieht:
     3 x cat
     2 x lars
     1 x rose
     1 x circus
     1 x cauliflower
     1 x bit
    */
    @Test
    public void Assignment2() {
        String words = "lars, cat, bit, cat, cauliflower, circus, rose, cat, lars";

        var str = Arrays.stream(words.split(", ")).toList();

        var sortedArray = str.stream().distinct().sorted().toList();

        for (String ite : sortedArray) {
            int counter = 0;
            for (String word : str) {
                if (ite.equals(word))
                    counter++;
            }
            System.out.println(counter+ " x " + ite);
        }

    }
}
