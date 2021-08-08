package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBconnectionURL());

        System.out.println(getDBconnectionURLSupplier.get());
    }

    static String getDBconnectionURL (){
        return "http://123.req/de";
    }

    static Supplier<List<String>> getDBconnectionURLSupplier
            = () -> List.of("http://123.req/de","http://123.req/fr");

}
