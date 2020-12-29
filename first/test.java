package first;
import java.util.Random;

public class test {

    public static void main(String[] args) {
        Random rand = new Random();
        int val = rand.nextInt(20);
        Windows w = new Windows();
        w.setVal(val);
    }
}