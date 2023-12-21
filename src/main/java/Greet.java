import ai.greycat.GreyCat;

public final class Greet {

    public static void main(String... args) throws Exception {
        String url = "http://localhost:8080";
        GreyCat greycat = new GreyCat(url, null, null, null);
        String greeting = (String) greycat.call("project::greet", "John", "Doe");
        System.out.println(greeting);
    }
}
