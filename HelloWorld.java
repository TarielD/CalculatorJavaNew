import java.util.Random;

/**
 * My first project
 *
 * @author Tariel Dzhumaev
 * @version 09.07.2020
 */

public class HelloWorld {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!!! "  + random.nextInt(100)); //output
        }
        int a = 1 + 5;
        System.out.println("a " + a);
    }
}

