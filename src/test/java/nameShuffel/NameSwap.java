package nameShuffel;

public class NameSwap {
    public static String shuffle(String s) {
        String[] name = s.split(" ");
        return name[1] + " " + name[0];
    }
}
