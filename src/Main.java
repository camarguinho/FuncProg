import java.util.List;
import java.util.function.Function;

/**
 * Function\<T, R> → recebe um T, devolve um R
 * Predicate\<T> → recebe um T, devolve boolean
 * Consumer\<T> → recebe um T, não devolve nada (efeito colateral)
 * Supplier\<T> → não recebe nada, devolve um T
 */
public class Main {

    public static void main(String[] args){
        learningFunction();
    }

    /**
     * Function<T, R> é: me dá um T, eu te devolvo um R.
     * É usada para transformar valores—mapear um tipo em outro.
     */
    private static void learningFunction() {
        List<String> input = List.of("a", "b", "c");
        Function<String,String> toUpCase = s -> s.toUpperCase();
        List<String> output = input.stream().map(toUpCase).toList();
        System.out.println(output);
    }
}
