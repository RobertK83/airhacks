/*
 */
package airhacks;

import org.junit.jupiter.api.Test;

/**
 *
 * @author airhacks.com
 */
public class JavaTest {


    public static Object developer() {
        return new Developer("duke",25);
    }

    @Test
    public void instanceofPatternMatching() {
        var dev = developer();
        if (dev instanceof Developer developer) {
            System.out.println("dev = " + developer.name());
        }
    }


}
