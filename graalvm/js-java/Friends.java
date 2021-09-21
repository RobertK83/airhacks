import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class Friends {

    public static void main(String[] args) {
        final Context context = Context.create("js");
        var javaScript = """
                (m =>  'hello: ' + m)
                """;
        final Value lambda = context.eval("js", javaScript);
        Value result = lambda.execute(" from java 16 with modules");
        System.out.println(result);
    }
    
}