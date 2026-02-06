import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Function\<T, R> → recebe um T, devolve um R
 * Predicate\<T> → recebe um T, devolve boolean
 * Consumer\<T> → recebe um T, não devolve nada (efeito colateral)
 * Supplier\<T> → não recebe nada, devolve um T
 */
public class Main {

    public static void main(String[] args){
        //learningFunction();
        learningPredicate();
    }

    /**
     * Function<T, R> é: me dá um T, eu te devolvo um R.
     * É usada para transformar valores—mapear um tipo em outro.
     */
    private static void learningFunction(){
        List<String> input = List.of("a", "b", "c");
        Function<String,String> toUpCase = s -> s.toUpperCase();
        List<String> output = input.stream().map(toUpCase).toList();
        System.out.println(output);
    }

    /**
     * Predicate<T> é: me dá um T, eu te digo se é verdadeiro ou falso.
     * É usado para filtrar, validar, decidir.
     */
    private static void learningPredicate(){
        List<String> input = List.of("Gato", "Pato", "Cachorro");
        Predicate<String> startWithG = s -> s.startsWith("G");
        List<String> output = input.stream().filter(startWithG).toList();
        System.out.println(output);


    }
}
