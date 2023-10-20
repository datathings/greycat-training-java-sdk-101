import ai.greycat.GreyCat;

public final class Greet {

    public static void main(String... args) throws Exception {
        GreyCat greycat = new GreyCat("http://localhost:8080");
        String greeting = (String) GreyCat.call(greycat, "project::greet", "John", "Doe");
        System.out.println(greeting);
    }
}
