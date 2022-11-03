import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s="this is a   testing string";

        String s1=Arrays.stream(s.split("\\s+")).map(w->new StringBuilder(w).reverse()).collect(Collectors.joining(" "));
        System.out.println(s1);

    }
}
