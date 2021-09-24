package airhacks;

import java.time.temporal.ChronoUnit;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.metrics.annotation.Metered;

@ApplicationScoped
public class Greeter {

    @Inject
    @ConfigProperty(name = "message", defaultValue = "good morning, hamburg")
    String message;

    @Metered
    @Fallback(fallbackMethod = "fetchFromCache")
    @Timeout(unit = ChronoUnit.MILLIS,value = 300)
    public String goodMorning() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        return this.message;
    }

    public String fetchFromCache() {
        return "network was too slow, hello HH";
    }
    
}
