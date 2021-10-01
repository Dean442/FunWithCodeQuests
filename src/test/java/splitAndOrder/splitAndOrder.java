package splitAndOrder;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import java.util.*;

@Slf4j
public class splitAndOrder {

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

        String[] split = words.split(", ");
        Map<String,Integer> hm = new HashMap();

        for(String x:split){
            if(!hm.containsKey(x)){
                hm.put(x,1);
            }else{
                hm.put(x, hm.get(x)+1);
            }
        }

        List sorted = sortMe(hm);

        for (Object entry:sorted){
            System.out.println(entry);
        }

    }

    private List sortMe(Map<String, Integer> hm) {

        List<String> toReturn = new ArrayList<>();

        for(String key:hm.keySet()){
            int thisValue = hm.get(key).intValue();
            toReturn.add(thisValue + " x " + key);
        }

        Collections.sort(toReturn, Collections.reverseOrder());
        return toReturn;
    }

}
