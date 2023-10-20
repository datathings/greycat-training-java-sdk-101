import ai.greycat.*;

public final class GetData {

    public static void main(String... args) throws Exception {
        GreyCat greycat = new GreyCat("http://localhost:8080");
        std.core.Array<?> data = (std.core.Array<?>) GreyCat.call(greycat, "project::getData");
        System.out.println("// Data:" + data);
        System.out.println("// Type: " + data.getClass() + "<" + data.iterator().next().getClass() + ">");
    }
}
