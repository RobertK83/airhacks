package airhacks;

import org.junit.jupiter.api.Test;


/**
 *
 * @author airhacks.com
 */
public class PatternMatchingWithSwitchTest{

    String typeDependentAction(Object o) {

        return switch (o) {
          case String s -> "string " + s;
          case Integer i -> "int " + i;
          default -> "no idea";
        };
        
    }

    @Test
    public void patternMatching() {
        System.out.println(typeDependentAction("duke"));
        System.out.println(typeDependentAction(42));
        System.out.println(typeDependentAction(42L));
    }


}
