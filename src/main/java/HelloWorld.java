import ai.greycat.*;

public final class HelloWorld {
    public static void main(String... args) throws Exception {
        String url = "http://localhost:8080";
        GreyCat greycat = new GreyCat(url, null, null, null);
        greycat.call("project::helloWorld");
    }
}