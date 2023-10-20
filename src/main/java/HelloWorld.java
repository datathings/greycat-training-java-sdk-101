import ai.greycat.*;

public final class HelloWorld {
    public static void main(String... args) throws Exception {
        GreyCat greycat = new GreyCat("http://localhost:8080");
        GreyCat.call(greycat, "project::helloWorld");
    }
}