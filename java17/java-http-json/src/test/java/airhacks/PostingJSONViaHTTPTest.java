/*
 */
package airhacks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

import org.junit.jupiter.api.Test;

/**
 *
 * @author airhacks.com
 */
public class PostingJSONViaHTTPTest {

    @Test
    public void post() throws URISyntaxException, IOException, InterruptedException {

        var message = """

                {"message":"%s"}

                """.formatted("hello,duke");
        var client = HttpClient.newBuilder().build();

        var uri = new URI("http://localhost:8080/crud/");

        var request = HttpRequest.newBuilder(uri).
                    POST(BodyPublishers.ofString(message))
                    .header("Content-type", "application/json").
                    build();

        var response = client.send(request, BodyHandlers.discarding());
        assertEquals(201, response.statusCode());

        var locationHeader = response.headers().firstValue("Location").get();
        System.out.println(locationHeader);


    }

}
