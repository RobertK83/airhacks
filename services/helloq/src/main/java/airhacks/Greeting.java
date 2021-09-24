package airhacks;

public class Greeting {

    public String message;
    public int prio;
    public Greeting(String message, int prio) {
        this.message = message;
        this.prio = prio;
    }

    public Greeting() {
    }

    @Override
    public String toString() {
        return "Greeting [message=" + message + ", prio=" + prio + "]";
    }

    
    
}
