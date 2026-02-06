import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Function\<T, R> → recebe um T, devolve um R
 * Predicate\<T> → recebe um T, devolve boolean
 * Consumer\<T> → recebe um T, não devolve nada (efeito colateral)
 * Supplier\<T> → não recebe nada, devolve um T
 */
public class Main {

    public static void main(String[] args){
        learningFunction();
        learningPredicate();
        learningConsumer();
        larningSupplier();
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

    /**
     * Consumer<T> é: me dá um T, eu faço algo com ele e não te devolvo nada.
     * É usado para efeitos colaterais—log, impressão, envio, gravação.
     */
    private static void learningConsumer(){
        Consumer<String> imprimir = s -> System.out.println("Imprimindo: " + s);
        imprimir.accept("Camargo");
    }

    /**
     * Supplier<T> é: não te peço nada, mas te entrego um T.
     * É usado para gerar valores sob demanda.
     */
    private static void larningSupplier(){
        Supplier<String> gerarId = () -> UUID.randomUUID().toString();
        System.out.println(gerarId.get());
    }
}
