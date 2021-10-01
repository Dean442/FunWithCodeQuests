package Tennis;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import java.util.*;

@Slf4j
public class Tennis {

    //Who wins a random game of tennis?
    @Test
    public void whoWinns() {
        String match = playGame();
        System.out.println(match);

        String winner;

        System.out.print("And the winner is: ");

    }

    private String playGame() {
        Random random = new Random();
        int low = 5;
        int high = 100;
        int result = random.nextInt(high-low) + low;

        String match = "a";

        for(int i = 1; i< result; i++){
            if(i % 2 == 0) {
                match += "a";
            }else{
                match += "b";
            }
        }
        return match;
    }

}
