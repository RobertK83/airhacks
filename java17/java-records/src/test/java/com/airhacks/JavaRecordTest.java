/*
 */
package com.airhacks;

import java.lang.reflect.RecordComponent;
import org.junit.jupiter.api.Test;

/**
 *
 * @author airhacks.com
 */
public class JavaRecordTest {

    @Test
    public void postRecord() {
        var post = new Post("hugo", "content",18);
        System.out.println("-- " + post);
        System.out.println("-- " + post.name());
        System.out.println("-- " + post.title());
        System.out.println("-- " + post.age());
        System.out.println("-- " + post.getClass().getName());
        System.out.println("-- " + post.getClass().isRecord());

        var components = post.getClass().getRecordComponents();
        for (RecordComponent component : components) {
            System.out.println("component: " + component);
        }
    }
}
