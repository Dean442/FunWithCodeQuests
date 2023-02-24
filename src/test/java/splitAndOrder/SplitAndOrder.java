package splitAndOrder;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import java.util.*;

@Slf4j
public class SplitAndOrder {

    /**
    Aufgabe:
    Sortiere die Wörter nach ihrer Anzahl absteigend, so dass die Ausgabe folgendermassen aussieht:
     1 x bit
     3 x cat
     1 x cauliflower
     1 x circus
     2 x lars
     1 x rose
    */
    @Test
    public void Assignment2() {
        String words = "lars, cat, bit, cat, cauliflower, circus, rose, cat, lars";

        List<String> wordList = Arrays.stream(words.split(", ")).sorted().toList();
        List<String> distinct = new ArrayList<>(wordList.stream().distinct().toList());

        for(int i=0; i < distinct.size(); i++){
            int n = 0;
            for (String s : wordList) {
                if (Objects.equals(distinct.get(i), s)) {
                    n++;
                }
            }
            distinct.set(i, n+" x "+ distinct.get(i));
        }
        var counted = distinct.stream().sorted(Comparator.reverseOrder()).toList();
        for(String item : counted) {
            System.out.println(item);
        }

    }
}
