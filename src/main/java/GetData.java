import ai.greycat.*;

public final class GetData {

    public static void main(String... args) throws Exception {

        String url = "http://localhost:8080";

        GreyCat greycat = new GreyCat(url, null, null, null);
        std.core.Array<?> data = (std.core.Array<?>) greycat.call("project::getData");
        System.out.println("// Data:" + data);
        System.out.println("// Type: " + data.getClass() + "<" + data.iterator().next().getClass() + ">");
    }
}
